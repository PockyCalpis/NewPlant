package newPlant;

public class Zombie extends LivingBeing{
private int x, y, speed;

	Zombie(int health, int atk, int x, int y, int speed) {
		super(health, atk);
		this.x = x;
		this.y = y;
		this.speed = speed;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void eatPlant(Plant plant) {
		plant.setHp(plant.getHp()-this.getAtk());
	}
}
