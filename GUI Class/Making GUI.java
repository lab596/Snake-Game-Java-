//Purpose: Basic GUI class that is called upon in order to construct the game. This is the class you run to make the game start.

//import that is used to construct GUI
import javax.swing.JFrame;


public class GUI extends JFrame{

  public GUI(){
    //calls the GUI which is given properties in the different class
    this.add(new GamePanel());
    //Gives the GUI a title that show up when you open it
    this.setTitle("Snake Game");
    //Allows for the application to close when you click the "x"
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //Prevents user from changing the size of the GUI
    this.setResizable(false);
    //Allows for a join dimension of both the area outside and the interface itself
    this.pack();
    //Allows for user to see the GUI - Makes it come on screen
    this.setVisible(true);
  }
}
