package plant;

public class LivingBeing {
	private int health, atk;

	LivingBeing(int health, int atk) {
		this.health = health;
		this.atk = atk;
	}

	public int getHp() {
		return health;
	}

	public void setHp(int health) {
		this.health = health;
	}

	public int getAtk() {
		return atk;
	}

}
