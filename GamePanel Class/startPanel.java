//startPanel method used to select the difficulty create another gui with title screen
//based on JFrame window = new JFrame(); 

//method that is called in the main class to make the start/ welcome screen
public void startPanel(){
         //JFrame window = new JFrame();
         //set size of window
         window.setSize(850,850);
         //allows for it to close on "x" click
         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         //background of it to black
         window.setBackground(Color.black);
         //lets it be seen
         window.setVisible(true);
         //doesnt let user change its size
         window.setResizable(false);
         
         //adds a panel
         JPanel startScreen = new JPanel();
         //sets location of panel
         startScreen.setBounds(100,100,600,150);
         //make its bacground also black
         startScreen.setBackground(Color.black);
         //adds label to the panel that says "Snake Game"
         title = new JLabel("Snake Game");
         //sets its color
         title.setForeground(Color.green);
         //sets its font and size
         title.setFont(new Font("Courier",Font.BOLD,60));
         
         //adds another panel
         JPanel easyP = new JPanel();
         //sets its location
         easyP.setBounds(100,400,200,100);
         //sets panel color
         easyP.setBackground(Color.black);
         //makes a button that says "EASY" on it
         easy = new JButton("EASY");
         //sets button bg color
         easy.setBackground(Color.black);
         //sets the color of the words on button
         easy.setForeground(Color.white);
         //sets font and size
         easy.setFont(new Font("Courier",Font.BOLD,40));
         //adds action listener on button
         easy.addActionListener(EB);
         
         //Repeats same thing for the next two buttons that are MEDIUM and HARD
         
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
         
         //adds the label/text title to the startscreen panel
         startScreen.add(title);
         //adds the button EASY to the easy panel
         easyP.add(easy);
         //adds the button MEDIUM to the easy panel
         medP.add(medium);
         //adds the button HARD to the easy panel
         hardP.add(hard);
         
         //adds the easy panel with its button nto the main panel
         window.add(easyP);
         //adds the medium panel with its button nto the main panel
         window.add(medP);
         //adds the hard panel with its button nto the main panel
         window.add(hardP);
         //adds the start screen panel with the title label to the main panel
         window.add(startScreen);
    }
