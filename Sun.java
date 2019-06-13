package newPlant;

/**
 * Sun
 * @version 1.0
 * @author Phoebe
 * Sun object that acts as money for buying plants to place on board
 */

public class Sun extends Plant{

	/**
	 * Constructor
	 * @param health int health value
	 * @param atk int attack value
	 * @param cooldown int cooldown value
	 * @param productionSpeed int production speed
	 */
	Sun(int health, int atk, int cooldown, int productionSpeed) {
		super(health, atk, cooldown, productionSpeed);
	}

}
