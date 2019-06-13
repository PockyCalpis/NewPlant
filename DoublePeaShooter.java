package newPlant;

/**
 * DoublePeaShooter
 * @version 1.0
 * @author Phoebe
 * Double pea shooter
 */

public class DoublePeaShooter extends Shooter{

	/**
	 * Constructor for Double Pea Shooter
	 * @param health health value of object
	 * @param atk attack value of object
	 * @param cooldown cooldown between shots fired
	 * @param productionSpeed rate of Pea production
	 */
	public DoublePeaShooter(int health, int atk, int cooldown, int productionSpeed) {
		super(health, atk, cooldown, productionSpeed);
	}

	/**
	 * method for double pea shooter attack
	 * @see Shooter#attack()
	 */
	@Override
	public void attack() {
		
	}

}
