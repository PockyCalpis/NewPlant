package newPlant;

/**
 * BucketZombie
 * @version 1.0
 * @author Phoebe
 * Armoured zombie with higher defense
 */

public class BucketZombie extends Zombie{

	/**
	 * Constructor for Bucket Zombie
	 * @param health health value of Bucket Zombie, should be more than regular zombie
	 * @param attack attack value of Bucket Zombie
	 * @param x x-position of object
	 * @param y y-position of object
	 * @param speed speed value of Bucket Zombie
	 */
	BucketZombie(int health, int attack, int x, int y, int speed){
		super(health, attack, x, y, speed);
	}
}
