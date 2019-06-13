package newPlant;

/**
 * SnowPeaShooter
 * @version 1.0
 * @author Phoebe + Samyar
 * Shoots snowpeas at Zombies, slowing them down
 */

public class SnowPeaShooter extends Shooter{

	/**
	 * Constructor
	 * @param health int health value
	 * @param atk int attack value
	 * @param cooldown int cooldown value
	 * @param productionSpeed int production speed
	 */
	public SnowPeaShooter(int health, int atk, int cooldown, int productionSpeed) {
		super(health, atk, cooldown, productionSpeed);
	}

	/**
	 * DoublePeaShooter implementation of attack()
	 * @see Shooter#attack()
	 */
	@Override
	public void attack () {
		
	}

}
