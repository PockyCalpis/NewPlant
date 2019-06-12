package newPlant;

import javax.swing.JFrame;
import java.util.ArrayList;
import javax.swing.JPanel;

import unit4.ShapeGameTemplate.GameAreaPanel;
import unit4.ShapeGameTemplate.MyKeyListener;

import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.Graphics;
import java.awt.Color;

public class Board extends JFrame {
	private Plant[][] plantArray;
	private ArrayList<LivingBeing> movingObjects;
	private LinkedList<Plant> team;
	private int level;
	boolean gameOver;
	GameAreaPanel gamePanel;

	Board() {
		gameOver = false;
		setPlantArray(new Plant[5][5]);
		setLevel(1);
		movingObjects = new ArrayList(0);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		gamePanel = new GameAreaPanel();
		this.add(new GameAreaPanel());

		MyMouseListener mouseListener = new MyMouseListener();
		this.addMouseListener(mouseListener);

		this.requestFocusInWindow();

		this.setVisible(true);
		while (gameOver != true) {

		}
	}

	public Plant[][] getPlantArray() {
		return plantArray;
	}

	public void setPlantArray(Plant[][] plantArray) {
		this.plantArray = plantArray;
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

			// draw all plants
			g.setColor(Color.RED);
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {

				}
			}
			// draw player zombies
			g.setColor(Color.BLUE);

			// repaint
			repaint();
		}
	}
	
	//inner class for mouse listener
	private class MyMouseListener implements MouseListener {

		public MyMouseListener() {
			// TODO Auto-generated constructor stub
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
