package newPlant;

/**
 * SprintingZombie
 * @version 1.0
 * @author Phoebe
 * Zombie with increased speed
 */

public class SprintingZombie extends Zombie {

	/**
	 * Sprinting Zombie Constructor
	 * @param health int health value
	 * @param attack int attack value
	 * @param x int x-position
	 * @param y int y-pposition
	 * @param speed int speed, faster than regular zombie
	 */
	SprintingZombie(int health, int attack, int x, int y, int speed) {
		super(health, attack, x, y, speed);
	}
}
