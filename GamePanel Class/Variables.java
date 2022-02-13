//Variables declared in the GamePanel class

    //int that detirmines how big a pixel is in the game - 20 pixels in a square
    static final int PIXEL_SIZE = 20;
    //how wide as well as tall the game is (800pixels by 800pixels) - computer pixels not the ones we declared before
    static final int SCREEN_WIDTH = 800;
    static final int SCREEN_HEIGHT = 800;
    //calculates the total number of game pixels there will be
    static final int ALL_PIXELS = (SCREEN_WIDTH*SCREEN_HEIGHT)/PIXEL_SIZE;
    //allows for a delay in movement so that the snake has a cetain speed
    static final int DELAY = 75;
  
    //making a matrix of all the pixels in the game
    final int x[] = new int[ALL_PIXELS];
    final int y[] = new int[ALL_PIXELS];
  
    //initial size of the snake
    int size = 6;
    //added to based on how many apples eaten
    int points;
    //location of the apple on screen based on its x and y position
    int appleXLoc;
    int appleYLoc;
    //direction booleans that are used to see what the user clicks and how to respond accordingly
    boolean right = true;
    boolean left = false;
    boolean up = false;
    boolean down = false;
    //variable that is used to start the game
    boolean gameOn = false;
    //timer used in the delay - control speed of snake
    Timer timer;
    //random used in order to create a random x and y pos for the apple
    Random random;
    //Variables used to make the starting screen
    JLabel title;
    JButton easy, medium, hard;
    
    TitleScreenHandler EB = new TitleScreenHandler();
    TitleScreenHandler MB = new TitleScreenHandler();
    TitleScreenHandler HB = new TitleScreenHandler();
    JFrame window = new JFrame();
