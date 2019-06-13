package newPlant;

/**
 * Pea
 * @version 1.0
 * @author Phoebe + Samyar
 * Pea object that is shot from peashooters. Can be regular pea or snowpea
 */

public class Pea extends LivingBeing implements Moveable{
	private int x, y;
	boolean isSnow;

	/**
	 * Constructor for Pea
	 * @param health int health value of pea
	 * @param atk int attack value of pea
	 * @param x int x-position of pea
	 * @param y int y-position of pea, should be constant
	 * @param isSnow boolean whether pea is coming from snow pea shooter or regular
	 */
	Pea(int health, int atk, int x, int y, boolean isSnow) {
		super(health, atk);
		this.setX(x);
		this.setY(y);
		this.isSnow = isSnow;
	}

	/**
	 * Method for giving damage to zombies
	 * @param zombie Zombie to be damaged
	 */
	public void damageZombie(Zombie zombie) {
		zombie.setHp(getHp()-1);
	}

	/**
	 * Method for slowing zombies down, only if snow pea
	 * @param zombie Zombie to be slowed
	 */
	public void slowZombie(Zombie zombie) {
		zombie.setHp(zombie.getHp()-this.getAtk());
		zombie.setSpeed(zombie.getSpeed()/2);
	}

	/**
	 * gets x-position
	 * @return int X position
	 */
	public int getX() {
		return x;
	}

	/**
	 * sets X position
	 * @param x int X position
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * gets Y position
	 * @return int Y position
	 */
	public int getY() {
		return y;
	}

	/**
	 * sets Y position
	 * @param y int Y position
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * moves peas 10 pixels at a time
	 * @see Moveable#move()
	 */
	@Override
	public void move() {
	setX(getX()+10);
	}
}
