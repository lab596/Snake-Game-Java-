    //Variables declared in the GamePanel class

    static final int PIXEL_SIZE = 20;
    static final int SCREEN_WIDTH = 800;
    static final int SCREEN_HEIGHT = 800;
    static final int ALL_PIXELS = (SCREEN_WIDTH*SCREEN_HEIGHT)/PIXEL_SIZE;
    static final int DELAY = 75;
  
    final int x[] = new int[ALL_PIXELS];
    final int y[] = new int[ALL_PIXELS];
  
    int size = 6;
    int points;
    int appleXLoc;
    int appleYLoc;
    char direction = 'R';
    boolean gameOn = false;
    Timer timer;
    Random random;
