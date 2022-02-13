    //Game panel - the main method that the class goes to first
     GamePanel(){
        //allows for the random variable to get a random number
        random = new Random();
       //sets size of main GUI
        this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
       //sets main GUI's color to black
        this.setBackground(Color.black); 
       //allows for main GUI to be selected and be in focus in the destop UI
        this.setFocusable(true);
        
        
         
        //adds a key listener to see what people click and calls it MyKeyAdapter
        this.addKeyListener(new MyKeyAdapter());
       //calls that start panel method that creates the starting screen GUI
        startPanel();

        //startGame();
    }
