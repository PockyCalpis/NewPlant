package newPlant;

import java.awt.Rectangle;

public interface Collidable {
	void setBoundingBox(Rectangle box);
	Rectangle getBoundingBox();
	boolean isCollision (Pea pea);
	boolean isCollision (Plant plant);
}
