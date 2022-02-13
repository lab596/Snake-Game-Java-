//Class that has action listener on three buttons in starting screen GUI
public class TitleScreenHandler implements ActionListener{
        
        public void actionPerformed(ActionEvent e){
          //sees if "EASY" is pressed and sets the starting screen to invisisble, changes speed of the game to be slower, and calls start game method
            if(e.getSource() == easy){
                window.setVisible(false);
                DELAY = 125;
                startGame();
            }
          //sees if "MEDIUM" is pressed and sets the starting screen to invisisble, changes speed of the game to be medium, and calls start game method
            if(e.getSource() == medium){
                window.setVisible(false);
                DELAY = 75;
                startGame();
            }
          //sees if "HARD" is pressed and sets the starting screen to invisisble, changes speed of the game to be fast, and calls start game method
            if(e.getSource() == hard){
                window.setVisible(false);
                DELAY = 25;
                startGame();
            }
        }
    }
