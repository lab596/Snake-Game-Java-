import javax.swing.JPanel;


import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.Random;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class GamePanel extends JPanel implements ActionListener{
    static final int PIXEL_SIZE = 20;
    static final int SCREEN_WIDTH = 800;
    static final int SCREEN_HEIGHT = 800;
    static final int ALL_PIXELS = (SCREEN_WIDTH*SCREEN_HEIGHT)/PIXEL_SIZE;
    static int DELAY = 75;
  
    final int x[] = new int[ALL_PIXELS];
    final int y[] = new int[ALL_PIXELS];
  
    int size = 6;
    int points;
    int appleXLoc;
    int appleYLoc;
    
    //char direction = 'R';
    
    boolean right = true;
    boolean left = false;
    boolean up = false;
    boolean down = false;
    
   
    boolean gameOn = false;
    Timer timer;
    Random random;
    JLabel title;
    JButton easy, medium, hard;
    
    TitleScreenHandler EB = new TitleScreenHandler();
    TitleScreenHandler MB = new TitleScreenHandler();
    TitleScreenHandler HB = new TitleScreenHandler();
    JFrame window = new JFrame();
    
    GamePanel(){
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
        this.setBackground(Color.black); 
        this.setFocusable(true);
        
        
         
     
        this.addKeyListener(new MyKeyAdapter());
        startPanel();

        //startGame();
    }
    public void startPanel(){
         //JFrame window = new JFrame();
         window.setSize(850,850);
         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         window.setBackground(Color.black);
         window.setVisible(true);
         window.setResizable(false);
         
         
         JPanel startScreen = new JPanel();
         startScreen.setBounds(100,100,600,150);
         startScreen.setBackground(Color.black);
         title = new JLabel("Snake Game");
         title.setForeground(Color.green);
         title.setFont(new Font("Courier",Font.BOLD,60));
         
         JPanel easyP = new JPanel();
         easyP.setBounds(100,400,200,100);
         easyP.setBackground(Color.black);
         easy = new JButton("EASY");
         easy.setBackground(Color.black);
         easy.setForeground(Color.white);
         easy.setFont(new Font("Courier",Font.BOLD,40));
         easy.addActionListener(EB);
         
         JPanel medP = new JPanel();
         medP.setBounds(300,400,200,100);
         medP.setBackground(Color.black);
         medium = new JButton("MEDIUM");
         medium.setBackground(Color.black);
         medium.setForeground(Color.white);
         medium.setFont(new Font("Courier",Font.BOLD,40));
         medium.addActionListener(MB);
         
         JPanel hardP = new JPanel();
         hardP.setBounds(500,400,200,100);
         hardP.setBackground(Color.black);
         hard = new JButton("HARD");
         hard.setBackground(Color.black);
         hard.setForeground(Color.white);
         hard.setFont(new Font("Courier",Font.BOLD,40));
         hard.addActionListener(HB);
         
         startScreen.add(title);
         easyP.add(easy);
         medP.add(medium);
         hardP.add(hard);
         
         window.add(easyP);
         window.add(medP);
         window.add(hardP);
         window.add(startScreen);
    }
    
    public void startGame(){
        newApple();
        gameOn = true;
        timer = new Timer(DELAY,this);
        timer.start();
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }
    
    public void draw(Graphics g){
        if(gameOn == true){
            for(int i =0; i<SCREEN_HEIGHT/PIXEL_SIZE;i++){
                g.drawLine(i*PIXEL_SIZE, 0, i*PIXEL_SIZE, SCREEN_HEIGHT);
                g.drawLine(0,i*PIXEL_SIZE, SCREEN_WIDTH, i*PIXEL_SIZE);
            }
            g.setColor(Color.red);
            g.fillOval(appleXLoc,appleYLoc,PIXEL_SIZE,PIXEL_SIZE);
        
            for(int i = 0; i< size; i++){
                if(i==0){
                    g.setColor(new Color(107,142,35));
                    g.fillRect(x[i], y[i], PIXEL_SIZE, PIXEL_SIZE);
                }
                else{
                    g.setColor(new Color(0,100,0));
                    g.fillRect(x[i], y[i], PIXEL_SIZE, PIXEL_SIZE);
                }
            }
            g.setColor(new Color(65,105,225));
            g.setFont(new Font("Courier",Font.BOLD,40));
            FontMetrics metrics = getFontMetrics(g.getFont());
            g.drawString("Size: "+ points, (SCREEN_WIDTH - metrics.stringWidth("Size: "+ points))/2, g.getFont().getSize());
        }
        else{
            gameOver(g);
        }
    }
    
    public void newApple(){
        appleXLoc = random.nextInt((int)(SCREEN_WIDTH/PIXEL_SIZE))*PIXEL_SIZE;
        appleYLoc = random.nextInt((int)(SCREEN_HEIGHT/PIXEL_SIZE))*PIXEL_SIZE;
    }
    
    public void move(){
        for(int i = size; i>0; i--){
            x[i] = x[i-1];
            y[i] = y[i-1];
        }
        /*
        switch(direction){
            case 'U':
                y[0] = y[0] - PIXEL_SIZE;
                break;
            case 'D':
                y[0] = y[0] + PIXEL_SIZE;
                break;
            case 'L':
                x[0] = x[0] - PIXEL_SIZE;
                break;
            case 'R':
                x[0] = x[0] + PIXEL_SIZE;
                break;
        }
        */
        
       
        if(left == true){
            x[0] = x[0] - PIXEL_SIZE;
        }
        if(right == true){
            x[0] = x[0] + PIXEL_SIZE;
        }
        if(up == true){
            y[0] = y[0] - PIXEL_SIZE;
        }
        if(down == true){
            y[0] = y[0] + PIXEL_SIZE;
        }
        
    }
    
    public void checkApple(){
        if((x[0] == appleXLoc) && (y[0] == appleYLoc)){
            size ++;
            points ++;
            newApple();
        }
    }
    
    public void checkCollisions(){
        for(int i = size; i > 0; i--){
            if((x[0] == x[i]) && (y[0] == y[i])){
                gameOn = false;
            }
        }
        if(x[0] < 0){
            gameOn = false;
        }
        if(x[0] > SCREEN_WIDTH){
            gameOn = false;
        }
        if(y[0] > SCREEN_HEIGHT){
            gameOn = false;
        }
        if(y[0] < 0){
            gameOn = false;
        }
        if(!gameOn){
            timer.stop();
        }
    }
    
    public void gameOver(Graphics g){
        if(points == 0){
           g.setColor(Color.black); 
        }
        else{
        g.setColor(new Color(65,105,225));
        g.setFont(new Font("Courier",Font.BOLD,40));
        FontMetrics metrics1 = getFontMetrics(g.getFont());
        g.drawString("Size: "+ points, (SCREEN_WIDTH - metrics1.stringWidth("Size: "+ points))/2, g.getFont().getSize());
        g.setColor(Color.red);
        g.setFont(new Font("Courier",Font.BOLD,75));
        FontMetrics metrics2 = getFontMetrics(g.getFont());
        g.drawString("You Died.", (SCREEN_WIDTH - metrics2.stringWidth("You Died."))/2, SCREEN_HEIGHT/2);
    }
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(gameOn){
            move();
            checkApple();
            checkCollisions();
            
        }
        repaint();
    }
    
    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            
            int key = e.getKeyCode();
            if((key==KeyEvent.VK_LEFT) && (right == false)){
                left = true;
                up = false;
                down=false;
            }
            if((key==KeyEvent.VK_RIGHT) && (left == false)){
                right = true;
                up = false;
                down=false;
            }
            if((key==KeyEvent.VK_UP) && (down == false)){
                up = true;
                right = false;
                left =false;
            }
            if((key==KeyEvent.VK_DOWN) && (up == false)){
                down = true;
                right = false;
                left =false;
            }
            if((key==KeyEvent.VK_ENTER) && (gameOn == false)){
                GUI new1 = new GUI();
                //GamePanel();
                //window.setVisible(true);
            }
            
            /*
            switch(e.getKeyCode()){
                
                case KeyEvent.VK_LEFT:
                    if(direction != 'R'){
                        direction = 'L';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if(direction != 'L'){
                        direction = 'R';
                    }
                    break;
                case KeyEvent.VK_UP:
                    if(direction != 'D'){
                        direction = 'U';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if(direction != 'U'){
                        direction = 'D';
                    }
                    break;
                    
            }
            */
            
        }
    } 
    public class TitleScreenHandler implements ActionListener{
        
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == easy){
                window.setVisible(false);
                DELAY = 125;
                startGame();
            }
            if(e.getSource() == medium){
                window.setVisible(false);
                DELAY = 75;
                startGame();
            }
            if(e.getSource() == hard){
                window.setVisible(false);
                DELAY = 25;
                startGame();
            }
        }
    }
}
