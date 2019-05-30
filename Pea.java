package plant;

public class Pea extends LivingBeing {
	private int x, y;
	boolean isSnow;

	Pea(int health, int atk, int x, int y, boolean isSnow) {
		super(health, atk);
		this.setX(x);
		this.setY(y);
		this.isSnow = isSnow;
	}
	
	public void damageZombie() {
	}

	public void slowZombie() {

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

	public void setY(int y) {
		this.y = y;
	}
}
