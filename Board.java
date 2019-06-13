package newPlant;

import javax.swing.JFrame;
import java.util.ArrayList;
import javax.swing.JPanel;

import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.Graphics;
import java.awt.Color;

/**
 * Board
 * @version 1.0
 * @author Phoebe + Samyar
 * Creates board where plants and zombies will appear
 */

public class Board extends JFrame {
	private Plant[][] plantArray;
	private ArrayList<LivingBeing> movingObjects;
	private LinkedList<Plant> team;
	private int level;
	private boolean gameOver;
	static JFrame window;
	JPanel gamePanel;

	/**
	 * Constructor for Board
	 * resets all values to default
	 */

	Board() {
		gameOver = false;
		setPlantArray(new Plant[5][5]);
		setLevel(1);
		movingObjects = new ArrayList(0);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		
		MyMouseListener mouseListener = new MyMouseListener();
		//addMouseListener(mouseListener);

		this.setVisible(true);
	}

	/**
	 * gets plant array
	 * @return plantArray where plants are stored
	 */
	public Plant[][] getPlantArray() {
		return plantArray;
	}

	/**
	 * sets plantArray to passed value
	 * @param plantArray array where plants are stored
	 */
	private void setPlantArray(Plant[][] plantArray) {
		this.plantArray = plantArray;
	}

	/**
	 * gets team of plants available for use
	 * @return team linkedlist of plants
	 */
	public LinkedList<Plant> getTeam() {
		return team;
	}

	/**
	 * sets your team
	 * @param team LinkedList of Plants to use to defend
	 */
	public void setTeam(LinkedList<Plant> team) {
		this.team = team;
	}

	/**
	 * gets current level
	 * @return current level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * sets level to passed value
	 * @param level level to be set
	 */
	private void setLevel(int level) {
		this.level = level;
	}

	/**
	 * MyMouseListener
	 * @version 1.0
	 * @author Phoebe
	 * Custom Mouse Listener implementing MouseListener
	 */
	private class MyMouseListener implements MouseListener {

		MyMouseListener() {
		}

		@Override
		public void mouseClicked(MouseEvent mouseEvent) {
			// TODO Auto-generated method stub
		}

		@Override
		public void mouseEntered(MouseEvent mouseEvent) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent mouseEvent) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent mouseEvent) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent mouseEvent) {
			// TODO Auto-generated method stub

		}

	}
}
