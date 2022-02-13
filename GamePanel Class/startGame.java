//start game method
public void startGame(){
        //calls a method that randomly places an apple on the screen
        newApple();
        //sets the variable gameOn to be true
        gameOn = true;
        //tells timer to use the delay number to change the speed of the snake
        timer = new Timer(DELAY,this);
        //calls the timer to start
        timer.start();
    }
