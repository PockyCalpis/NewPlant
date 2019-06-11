package newPlant;

public class Sunflower extends Plant implements Sunnable{

	Sunflower(int health, int atk, int cooldown, int productionSpeed) {
		super(health, atk, cooldown, productionSpeed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void produceSun() {
		Sun newSun = new Sun(200,0,0,0);
	}

}
