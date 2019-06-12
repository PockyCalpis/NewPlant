package newPlant;

public class Pea extends LivingBeing implements Moveable{
	private int x, y;
	boolean isSnow;

	Pea(int health, int atk, int x, int y, boolean isSnow) {
		super(health, atk);
		this.setX(x);
		this.setY(y);
		this.isSnow = isSnow;
	}
	
	public void damageZombie(Zombie zombie) {
	}

	public void slowZombie(Zombie zombie) {
		zombie.setHp(zombie.getHp()-this.getAtk());
		zombie.setSpeed(zombie.getSpeed()/2);
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

	@Override
	public void move() {
	setX(getX()+10);
	}
}
