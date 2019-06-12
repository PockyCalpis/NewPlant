package newPlant;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.*;

public class GUI extends JFrame {
	GameAreaPanel gamePanel;
	final int Maxx, Maxy;
	Dimension screenSize;
	
    GUI() {
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        
        Maxx = (int) screenSize.getWidth();
        Maxy = (int) screenSize.getWidth();
		
        //this = new JFrame("Plants vs Zombies");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(screenSize);
        this.setLayout(null);
        this.setVisible(true);
        this.setFocusable(true);
        this.requestFocusInWindow(true);
        
        gamePanel = new GameAreaPanel();

        this.add(gamePanel);
        this.revalidate();
        Thread t = new Thread(new GameLoop());
        t.start();
        
    }
    
    private class GameLoop implements Runnable {
    	public void run() {
    		
    	}
    	
    }
       private class GameAreaPanel extends JPanel {
        	GameAreaPanel() {
        		this.setVisible(true);
        		this.revalidate();
        	}
        	
    		public void paintComponent(Graphics g) {
    			super.paintComponent(g); // required
    			setDoubleBuffered(true);
    			System.out.println("draw");
    			// draw plants
    			g.setColor(Color.GREEN);
    			for(int i = 0; i < 4; i++) {
    				for(int j = 0; j < 4; j++) {
    					g.fillOval(0, 0, 1000, 1000);
    				}
    			}
    			//draws zombies 
    			g.setColor(Color.BLACK);
    			g.fillOval(0, 0, 30, 30);
    			
    			// draws peas
    			g.setColor(Color.RED);
    			g.fillRect(300,300, 40, 40);

    			// repaint
    			this.repaint();
    		}
    	}
    }

