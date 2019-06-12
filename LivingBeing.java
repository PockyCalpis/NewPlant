package newPlant;

import java.awt.Rectangle;

public class LivingBeing implements Collidable{
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

	@Override
	public void setBoundingBox(Rectangle box) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Rectangle getBoundingBox() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isCollision(Pea pea) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCollision(Plant plant) {
		// TODO Auto-generated method stub
		return false;
	}

}
