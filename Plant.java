package newPlant;

/**
 * Plant
 * @version 1.0
 * @author Phoebe
 * Plant class
 */

public class Plant extends LivingBeing {
	private int cooldown, productionSpeed;

	/**
	 * Constructor for Plant
	 * @param health int health value for Plant
	 * @param atk int attack value for Plant
	 * @param cooldown int firing cooldown value
	 * @param productionSpeed int production rate
	 */
	Plant(int health, int atk, int cooldown, int productionSpeed) {
		super(health, atk);
		this.setCooldown(cooldown);
		this.productionSpeed = productionSpeed;
	}

	/**
	 * gets production speed
	 * @return int production speed
	 */
	public int getProductionSpeed() {
		return productionSpeed;
	}

	/**
	 * gets cooldown value
	 * @return int cooldown
	 */
	public int getCooldown() {
		return cooldown;
	}

	/**
	 * set cooldown value
	 * @param cooldown int cooldown rate
	 */
	public void setCooldown(int cooldown) {
		this.cooldown = cooldown;
	}

}
