package newPlant;

public abstract class Shooter extends Plant {

	public Shooter(int health, int atk, int cooldown, int productionSpeed) {
		super(health, atk, cooldown, productionSpeed);
	}

	public abstract void attack();
}
