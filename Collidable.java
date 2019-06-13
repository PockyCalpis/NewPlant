package newPlant;

import java.awt.Rectangle;

/**
 * Collidable
 * @version 1.0
 * @author Phoebe
 * Interface to be implemented in appropriate classes
 */

public interface Collidable {

	/**
	 * sets hitbox for objects
	 * @param box hitbox
	 */
	void setBoundingBox(Rectangle box);

	/**
	 * returns bounding box
	 * @return bounding box
	 */
	Rectangle getBoundingBox();

	/**
	 * checks whether a collision with a Pea is made
	 * @param pea colliding object
	 * @return boolean true/false
	 */
	boolean isCollision (Pea pea);

	/**
	 * Checks whether a collision with a Plant is made, generally with a Zombie
	 * @param plant colliding object
	 * @return boolean true/false
	 */
	boolean isCollision (Plant plant);
}
