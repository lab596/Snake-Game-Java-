//graphics used that paint stuff on the screen
//calls graphics engine
public void paintComponent(Graphics g){
        //uses super to call from import
        super.paintComponent(g);
        //calls draw function within that import
        draw(g);
    }
    
    //used to draw
    public void draw(Graphics g){
        //if the game is on draw these lines that make up the grid
        if(gameOn == true){
            for(int i =0; i<SCREEN_HEIGHT/PIXEL_SIZE;i++){
                g.drawLine(i*PIXEL_SIZE, 0, i*PIXEL_SIZE, SCREEN_HEIGHT);
                g.drawLine(0,i*PIXEL_SIZE, SCREEN_WIDTH, i*PIXEL_SIZE);
            }
            //makes the apple with its size and its color red
            g.setColor(Color.red);
            g.fillOval(appleXLoc,appleYLoc,PIXEL_SIZE,PIXEL_SIZE);
          
            //sets the head of the snake to a green color
            for(int i = 0; i< size; i++){
                if(i==0){
                    g.setColor(new Color(107,142,35));
                    g.fillRect(x[i], y[i], PIXEL_SIZE, PIXEL_SIZE);
                }
                //sets body of the snake to a custom green color
                else{
                    g.setColor(new Color(0,100,0));
                    g.fillRect(x[i], y[i], PIXEL_SIZE, PIXEL_SIZE);
                }
            }
            //makes the score at the top of the screen
            g.setColor(new Color(65,105,225));
            g.setFont(new Font("Courier",Font.BOLD,40));
            FontMetrics metrics = getFontMetrics(g.getFont());
            g.drawString("Size: "+ points, (SCREEN_WIDTH - metrics.stringWidth("Size: "+ points))/2, g.getFont().getSize());
        }
        else{
            //calls game over method if game is off
            gameOver(g);
        }
    }

public void gameOver(Graphics g){
        //shows nothing if 0 points are scored
        if(points == 0){
           g.setColor(Color.black); 
        }
        else{
        //displays score 
        g.setColor(new Color(65,105,225));
        g.setFont(new Font("Courier",Font.BOLD,40));
        FontMetrics metrics1 = getFontMetrics(g.getFont());
        g.drawString("Size: "+ points, (SCREEN_WIDTH - metrics1.stringWidth("Size: "+ points))/2, g.getFont().getSize());
        //displays "Game Over"
        g.setColor(Color.red);
        g.setFont(new Font("Courier",Font.BOLD,75));
        FontMetrics metrics2 = getFontMetrics(g.getFont());
        g.drawString("You Died.", (SCREEN_WIDTH - metrics2.stringWidth("You Died."))/2, SCREEN_HEIGHT/2);
    }
    }
