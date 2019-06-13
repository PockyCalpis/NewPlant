package newPlant;

/**
 * SinglePeaShooter
 * @version 1.0
 * @author Phoebe
 * Pea Shooter
 */

public class SinglePeaShooter extends Shooter {

	/**
	 * Constructor
	 * @param health int health value
	 * @param atk int attack value
	 * @param cooldown int cooldown value
	 * @param productionSpeed int production speed
	 */
	public SinglePeaShooter(int health, int atk, int cooldown, int productionSpeed) {
		super(health, atk, cooldown, productionSpeed);
	}

	/**
	 * Single Pea shooter implementation of attack()
	 * @see Shooter#attack()
	 */
	@Override
	public void attack() {
	
	}
}
