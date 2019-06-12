package newPlant;

public class Sunflower extends Plant{

	Sunflower(int health, int atk, int cooldown, int productionSpeed) {
		super(health, atk, cooldown, productionSpeed);
		// TODO Auto-generated constructor stub
	}

	public void produceSun() {
		Sun newSun = new Sun(200,0,0,0);
	}

}
