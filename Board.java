package newPlant;

public class Board implements Sunnable{
	private Plant[][] plantArray;
	private Zombie[][] zombieColumn;
	private LinkedList<Plant> team;

	Board() {
		setPlantArray(new Plant[5][5]);
		setZombieColumn(new Zombie[10][10]);
		
	}

	public Plant[][] getPlantArray() {
		return plantArray;
	}

	public void setPlantArray(Plant[][] plantArray) {
		this.plantArray = plantArray;
	}

	public Zombie[][] getZombieColumn() {
		return zombieColumn;
	}

	public void setZombieColumn(Zombie[][] zombieColumn) {
		this.zombieColumn = zombieColumn;
	}


	@Override
	public void produceSun(Sun sun) {
		// TODO Auto-generated method stub
		
	}

	public LinkedList<Plant> getTeam() {
		return team;
	}

	public void setTeam(LinkedList<Plant> team) {
		this.team = team;
	}

}
