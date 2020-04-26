package FX_W20PKG;

public class ResidentialBuilding extends Building {

	private int maxNumberOfHabitants;
	
	public ResidentialBuilding(int year, double cost, double landSpace, String material, int max) {
		
		super(year, cost, landSpace, material);
		this.maxNumberOfHabitants = max;
		
	}
	
	public int getMaxNumberOfHabitants() {
		
		return maxNumberOfHabitants;
		
	}
	@Override
	public String toString() {
		
		return super.toString() + "max number of habitants is " + maxNumberOfHabitants + ", ";
	
	}
	@Override
	public ResidentialBuilding clone() {
	
		Building bld = super.clone();
		return new ResidentialBuilding(bld.getYearOfCreation(), bld.getCost(), 
			bld.getLandSpace(), bld.getMaterial(), this.maxNumberOfHabitants);
		
	}
	
}
