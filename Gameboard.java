package newPlant;

public class Gameboard {
    private int width, height;
    private Plant[][] gameboard = new Plant[width][height];
    private Zombie[] zombies = new Zombie[height];

    Gameboard(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public Plant[][] getGameboard() {
        return gameboard;
    }

    public Zombie[] getZombies() {
        return zombies;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
}
