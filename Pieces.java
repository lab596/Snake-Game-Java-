import java.awt.Image;
import javax.swing.ImageIcon;


public class Boundry extends JPanel{ //in this class
  final int pixelSize = 20;
  final int allPixels = 1600;
  
  private final int x[] = new int[allPixels];
  private final int y[] = new int[allPixels];
  
  private int pixels;
  private int appleXLoc;
  private int appleYLoc;

  private boolean leftDirection = false;
  private boolean rightDirection = true;
  private boolean upDirection = false;
  private boolean downDirection = false;
  private boolean inGame = true;

  private Image body;
  private Image apple;
  private Image head;
