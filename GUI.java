package newPlant;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.*;

public class GUI extends JFrame{
	JPanel gamePanel;
	final int Maxx, Maxy;
	Dimension screenSize;
	JFrame frame;
	
    GUI() {
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        
        Maxx = (int) screenSize.getWidth();
        Maxy = (int) screenSize.getWidth();
		
        frame = new JFrame("Plants vs Zombies");
        gamePanel = new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(screenSize);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }
        class GameAreaPanel extends JPanel {
    		public void paintComponent(Graphics g) {
    			super.paintComponent(g); // required
    			setDoubleBuffered(true);

    			// draw plants
    			g.setColor(Color.GREEN);
    			for(int i = 0; i < 4; i++) {
    				for(int j = 0; j < 4; j++) {
    					g.drawOval(0, 0, 20, 20);
    				}
    			}

    			//draws zombies 
    			g.setColor(Color.BLACK);
    			g.drawOval(0, 0, 30, 30);
    			
    			// draws peas
    			g.setColor(Color.RED);
    			g.drawRect(300,300, 40, 40);

    			// repaint
    			repaint();
    		}
    	}
    }

