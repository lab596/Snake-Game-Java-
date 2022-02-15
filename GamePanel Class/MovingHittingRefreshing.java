//uses listener in order to move the snake
public void move(){
        //for the whole snake it moves it pixels to where the last one was (the one ahead of it in the body)
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
        
       //if left is clicked make the head go a pixel to the left in the x direction
        if(left == true){
            x[0] = x[0] - PIXEL_SIZE;
        }
        //if right is clicked make the head go a pixel to the right in the x direction
        if(right == true){
            x[0] = x[0] + PIXEL_SIZE;
        }
        //if up is clicked make the head go a pixel up in the y direction
        if(up == true){
            y[0] = y[0] - PIXEL_SIZE;
        }
        //if down is clicked make the head go a pixel dowm in the y direction
        if(down == true){
            y[0] = y[0] + PIXEL_SIZE;
        }
        
    }
//checks to see if head hits edge of screen
public void checkCollisions(){
        //for the size of the snake check if the head is in the same position as any body part (head hit itself)
        for(int i = size; i > 0; i--){
            if((x[0] == x[i]) && (y[0] == y[i])){
                gameOn = false;
            }
        }
        //see if head is off left end of the screen
        if(x[0] < 0){
            gameOn = false;
        }
        //see if head is off right end of the screen
        if(x[0] > SCREEN_WIDTH){
            gameOn = false;
        }
        //see if head is off bottom end of the screen
        if(y[0] > SCREEN_HEIGHT){
            gameOn = false;
        }
        //see if head is off top end of the screen
        if(y[0] < 0){
            gameOn = false;
        }
        if(!gameOn){
            timer.stop();
        }
    }

//refreshes the screen and performs following functions
@Override
    public void actionPerformed(ActionEvent e){
        if(gameOn){
            //if player has moved
            move();
            // if apple is still there
            checkApple();
            //if player has hit boundry
            checkCollisions();
            
        }
        //repaints screen
        repaint();
    }
