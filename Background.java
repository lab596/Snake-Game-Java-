// Goes in public Boundry() of GUI interface
//Boundries

import java.awt.*;
        JPanel eastPanel = new JPanel(); 
        eastPanel.setBackground(Color.green); 
         JPanel westPanel = new JPanel(); 
        westPanel.setBackground(Color.green);
         JPanel northPanel = new JPanel(); 
        northPanel.setBackground(Color.green);
         JPanel southPanel = new JPanel(); 
        southPanel.setBackground(Color.green);
         JPanel centralPanel = new JPanel();
         centralPanel.setBackground(Color.black);
         
        Container pane = SGui.getContentPane();
        pane.add(northPanel,BorderLayout.NORTH); 
        pane.add(southPanel,BorderLayout.SOUTH); 
        pane.add(eastPanel,BorderLayout.EAST); 
        pane.add(westPanel,BorderLayout.WEST); 
        pane.add(centralPanel,BorderLayout.CENTER); 
