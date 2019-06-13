package newPlant;

/**
 * Wallnut
 * @version 1.0
 * @author Phoebe
 * Defensive plant with higher health stat, no attack
 */

public class Wallnut extends Plant{

	/**
	 * Constructor
	 * @param health int health value
	 * @param atk int attack value
	 * @param cooldown int cooldown value
	 * @param productionSpeed int production speed
	 */
	Wallnut(int health, int atk, int cooldown, int productionSpeed) {
		super(health, atk, cooldown, productionSpeed);
	}
}
