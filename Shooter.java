package newPlant;

/**
 * Shooter
 * @version 1.0
 * @author Phoebe
 * Abstract class for plants to implement the attack method
 */

public abstract class Shooter extends Plant {

	/**
	 * Constructor for Shooter
	 * @param health int health value
	 * @param atk int attack value
	 * @param cooldown int cooldown value
	 * @param productionSpeed int production speed
	 */
	public Shooter(int health, int atk, int cooldown, int productionSpeed) {
		super(health, atk, cooldown, productionSpeed);
	}

	/**
	 * abstract method for attacking
	 */
	public abstract void attack();
}
