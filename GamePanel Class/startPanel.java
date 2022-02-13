//startPanel method used to select the difficulty create another gui with title screen
//based on JFrame window = new JFrame(); 

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
