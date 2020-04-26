package FX_W20PKG;

public class House extends ResidentialBuilding {

	private double numberOfRooms;
	private int numOfFloors;
	
	public House(int year, double cost, double landSpace, String material, int habitants, double rooms, int floors) {
		
		super(year, cost, landSpace, material, habitants);
		this.numberOfRooms = rooms;
		this.numOfFloors = floors;
		
	}
	
	public double getNumberOfRooms() {
		
		return numberOfRooms;
		
	}
	
	public int getNumOfFloors() {
		
		return numOfFloors;
		
	}
	@Override
	public String toString() {
		
		return super.toString() + "and its number of rooms is " + 
			numberOfRooms + ", its number of floors is " + numOfFloors;
	
	}
	@Override
	public House clone() {
		
		ResidentialBuilding rb = super.clone();
		return new House(rb.getYearOfCreation(), rb.getCost(), rb.getLandSpace(), rb.getMaterial(),
			rb.getMaxNumberOfHabitants(), this.numberOfRooms, this.numOfFloors);
		
	}
	
}
