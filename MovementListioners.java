import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

//Listioners to be added in respect to each button is as follows:

ListienForKeys lForKeys = new ListenForKeys();
leftDirection.addKeyListener(lForKeys);
rigthDirection.addKeyListener(lForKeys);
upDirection.addKeyListener(lForKeys);
downDirection.addKeyListener(lForKeys);

//class for action based on the listeners

private class ListenForKeys implements KeyListener{
  public void keyPressed(KeyEvent e) {

            int key = e.getKeyCode();

            if ((key == KeyEvent.VK_LEFT) && (!rightDirection)) {
                leftDirection = true;
                upDirection = false;
                downDirection = false;
            }

            if ((key == KeyEvent.VK_RIGHT) && (!leftDirection)) {
                rightDirection = true;
                upDirection = false;
                downDirection = false;
            }

            if ((key == KeyEvent.VK_UP) && (!downDirection)) {
                upDirection = true;
                rightDirection = false;
                leftDirection = false;
            }

            if ((key == KeyEvent.VK_DOWN) && (!upDirection)) {
                downDirection = true;
                rightDirection = false;
                leftDirection = false;
            }
        }
  
