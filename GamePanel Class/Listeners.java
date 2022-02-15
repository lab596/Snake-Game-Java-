//Class that has action listener on three buttons in starting screen GUI
public class TitleScreenHandler implements ActionListener{
        
        public void actionPerformed(ActionEvent e){
          //sees if "EASY" is pressed and sets the starting screen to invisisble, changes speed of the game to be slower, and calls start game method
            if(e.getSource() == easy){
                window.setVisible(false);
                DELAY = 125;
                startGame();
            }
          //sees if "MEDIUM" is pressed and sets the starting screen to invisisble, changes speed of the game to be medium, and calls start game method
            if(e.getSource() == medium){
                window.setVisible(false);
                DELAY = 75;
                startGame();
            }
          //sees if "HARD" is pressed and sets the starting screen to invisisble, changes speed of the game to be fast, and calls start game method
            if(e.getSource() == hard){
                window.setVisible(false);
                DELAY = 25;
                startGame();
            }
        }
    }

//used to see what the user clicks
public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            
            int key = e.getKeyCode();
            //turns left if not already right
            if((key==KeyEvent.VK_LEFT) && (right == false)){
                left = true;
                up = false;
                down=false;
            }
             //turns rigth if not already left
            if((key==KeyEvent.VK_RIGHT) && (left == false)){
                right = true;
                up = false;
                down=false;
            }
            //turns up if not already down
            if((key==KeyEvent.VK_UP) && (down == false)){
                up = true;
                right = false;
                left =false;
            }
            //turns down if not already up
            if((key==KeyEvent.VK_DOWN) && (up == false)){
                down = true;
                right = false;
                left =false;
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
