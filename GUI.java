package newPlant;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.*;

public class GUI extends JFrame{
	JPanel gamePanel;

    GUI() {
        JFrame frame = new JFrame("Plants vs Zombies");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        frame.setLayout(null);
        frame.setVisible(true);
        gamePanel = new GameAreaPanel();
		this.add(new GameAreaPanel());
		
    }
        private class GameAreaPanel extends JPanel {
    		public void paintComponent(Graphics g) {
    			super.paintComponent(g); // required
    			setDoubleBuffered(true);

    			// move enemies
    			

    			// check for collision

    			// draw all squares
    			g.setColor(Color.RED);
    			for(int i = 0; i < 5; i++) {
    				g.fillRect((int)enemies[i].getX(),(int)enemies[i].getX(),(int)enemies[i].getHeight(),(int)enemies[i].getWidth());

    			}

    			// draw player circle
    			g.setColor(Color.BLUE);
    			g.fillOval((int)player.getX(),(int)player.getY(), (int)player.getRadius(), (int)player.getRadius());

    			// repaint
    			repaint();
    		}
    	}
    }

