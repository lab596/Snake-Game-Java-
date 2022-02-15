//new apple method 
public void newApple(){
        //sets the apple x location to an int that is random and within the screen width and is the size of a game pixel
        appleXLoc = random.nextInt((int)(SCREEN_WIDTH/PIXEL_SIZE))*PIXEL_SIZE;
        //sets the apple y location to an int that is random and within the screen height and is the size of a game pixel
        appleYLoc = random.nextInt((int)(SCREEN_HEIGHT/PIXEL_SIZE))*PIXEL_SIZE;
    }

//check apple method
public void checkApple(){
        //sees if the x and y coordinate of the player is the same as coordinates of apple
        if((x[0] == appleXLoc) && (y[0] == appleYLoc)){
            //increases size of the snake
            size ++;
            //increases points that the player has
            points ++;
            //randomly adds a new apple to the game board
            newApple();
        }
    }
