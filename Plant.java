package plant;

public class Plant extends LivingBeing {
	private int cooldown, productionSpeed;

	Plant(int health, int atk, int cooldown, int productionSpeed) {
		super(health, atk);
		this.setCooldown(cooldown);
		this.productionSpeed = productionSpeed;
	}

	public int getCD() {
		return getCooldown();
	}

	public int getProductionSpeed() {
		return productionSpeed;
	}

	public int getCooldown() {
		return cooldown;
	}

	public void setCooldown(int cooldown) {
		this.cooldown = cooldown;
	}

}
