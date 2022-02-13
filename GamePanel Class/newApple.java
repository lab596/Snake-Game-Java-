//new apple method 
public void newApple(){
        //sets the apple x location to an int that is random and within the screen width and is the size of a game pixel
        appleXLoc = random.nextInt((int)(SCREEN_WIDTH/PIXEL_SIZE))*PIXEL_SIZE;
        //sets the apple y location to an int that is random and within the screen height and is the size of a game pixel
        appleYLoc = random.nextInt((int)(SCREEN_HEIGHT/PIXEL_SIZE))*PIXEL_SIZE;
    }
