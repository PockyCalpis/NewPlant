package newPlant;

import java.awt.Rectangle;

/**
 * Zombie
 * @version 1.5
 * @author Phoebe + Samyar
 * Zombie class
 */

public class Zombie extends LivingBeing implements Moveable{
private int x, y, speed;

	/**
	 * Zombie Constructor
	 * @param health int health value
	 * @param atk int attack value
	 * @param x int x-position
	 * @param y int y-pposition
	 * @param speed int speed, faster than regular zombie
	 */
	Zombie(int health, int atk, int x, int y, int speed) {
		super(health, atk);
		this.x = x;
		this.y = y;
		this.speed = speed;
	}

	/**
	 * gets X position
	 * @return int x
	 */
	public int getX() {
		return x;
	}

	/**
	 * sets x position
	 * @param x int x value
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * gets y position
	 * @return int y
	 */
	public int getY() {
		return y;
	}

	/**
	 * gets speed
	 * @return int speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * sets speed
	 * @param speed int speed to be set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/**
	 * method for reducing health of plants
	 * @param plant Plant to be eaten
	 */
	public void eatPlant(Plant plant) {
		plant.setHp(plant.getHp()-this.getAtk());
	}

	/**
	 * Implementation of move()
	 * slow movement
	 * @see Moveable#move()
	 */
	@Override
	public void move() {
		setX(getX()-5);

	}
}
