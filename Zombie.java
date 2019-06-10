package newPlant;

import java.awt.Rectangle;

public class Zombie extends LivingBeing implements Collidable, Moveable{
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

	@Override
	public void move() {
		this.setX(x++);
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
