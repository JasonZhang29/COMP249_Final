package FX_W20PKG;

public class CondoBuilding extends ResidentialBuilding {

	private int numOfUnits;
	
	public CondoBuilding(int year, double cost, double landSpace, String material, int habitants, int units) {
		
		super(year, cost, landSpace, material, habitants);
		this.numOfUnits = units;
		
	}
	
	public int getNumOfUnits() {
		
		return numOfUnits;
		
	}
	@Override
	public String toString() {
		
		return super.toString() + "and its number of units is " + numOfUnits;
	
	}
	@Override
	public CondoBuilding clone() {
		
		ResidentialBuilding rb = super.clone();
		return new CondoBuilding(rb.getYearOfCreation(), rb.getCost(), rb.getLandSpace(),
				rb.getMaterial(), rb.getMaxNumberOfHabitants(), this.numOfUnits);
		
	}
	
}
