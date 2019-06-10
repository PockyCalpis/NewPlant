package newPlant;

import java.awt.Rectangle;

public interface Collidable {

	public void setBoundingBox(Rectangle box);
	public Rectangle getBoundingBox();
	public boolean isCollision (Pea pea);
	public boolean isCollision (Plant plant);
}
