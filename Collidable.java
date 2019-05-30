package newPlant;

import java.awt.Rectangle;

public interface Collidable {

	public void setBoundingBox(Rectangle box);
	public Rectangle getBoundingBox();
	public boolean isCollision (Rectangle other);
}
