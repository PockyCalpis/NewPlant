package newPlant;

import javax.swing.JFrame;
import java.util.ArrayList;
import javax.swing.JPanel;

import newPlant.GUI.GameAreaPanel;

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
	static JFrame window;
	JPanel gamePanel;

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
		addMouseListener(mouseListener);

		this.setVisible(true);
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

	// inner class for mouse listener
	private class MyMouseListener implements MouseListener {

		public MyMouseListener() {
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
