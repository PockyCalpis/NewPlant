package newPlant;

/**
 * Sunflower
 * @version 1.0
 * @author Phoebe
 * Generates Sun objects
 */

public class Sunflower extends Plant{

	/**
	 * Constructor
	 * @param health int health value
	 * @param atk int attack value
	 * @param cooldown int cooldown value
	 * @param productionSpeed int production speed
	 */
	Sunflower(int health, int atk, int cooldown, int productionSpeed) {
		super(health, atk, cooldown, productionSpeed);
		// TODO Auto-generated constructor stub
	}

	/**
	 * method for producing Sun objects
	 */
	public void produceSun() {
		Sun newSun = new Sun(200,0,0,0);
	}

}
