package newPlant;

import java.awt.Rectangle;

/**
 * LivingBeing
 * @version 1.0
 * @author Phoebe + Samyar
 * Superclass for plants and zombies
 */

public class LivingBeing implements Collidable{
	private int health, atk;

	/**
	 * LivingBeing Constructor
	 * @param health health value of living being
	 * @param atk attack value of living being
	 */
	LivingBeing(int health, int atk) {
		this.health = health;
		this.atk = atk;
	}

	/**
	 * gets HP of object
	 * @return int HP
	 */
	public int getHp() {
		return health;
	}

	/**
	 * sets HP of object
	 * @param health int health contains health value of object
	 */
	public void setHp(int health) {
		this.health = health;
	}

	/**
	 * gets attack value of object
	 * @return int atk
	 */
	public int getAtk() {
		return atk;
	}

	@Override
	public void setBoundingBox(Rectangle box) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Rectangle getBoundingBox() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isCollision(Pea pea) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCollision(Plant plant) {
		// TODO Auto-generated method stub
		return false;
	}

}
