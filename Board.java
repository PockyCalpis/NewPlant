package newPlant;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Toolkit;
import java.awt.Graphics;
import java.awt.Color;

public class Board extends JFrame implements Sunnable{
	private Plant[][] plantArray;
	private Zombie[] zombieColumn;
	private LinkedList<Plant> team;
	private int level;
	
	Board() {
		setPlantArray(new Plant[5][5]);
		setZombieColumn(new Zombie[5]);
		setLevel(1);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
	}

	public Plant[][] getPlantArray() {
		return plantArray;
	}

	public void setPlantArray(Plant[][] plantArray) {
		this.plantArray = plantArray;
	}

	public Zombie[] getZombieColumn() {
		return zombieColumn;
	}

	public void setZombieColumn(Zombie[] zombies) {
		this.zombieColumn = zombies;
	}


	@Override
	public void produceSun() {
		Sun newSun = new Sun(200,0,0,0);	
	}

	public LinkedList<Plant> getTeam() {
		return team;
	}

	public void setTeam(LinkedList<Plant> team) {
		this.team = team;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
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
				;

			}

			// draw player circle
			g.setColor(Color.BLUE);

			// repaint
			repaint();
		}
	}

}
