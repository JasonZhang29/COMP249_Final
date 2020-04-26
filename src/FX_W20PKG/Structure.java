package FX_W20PKG;

public class Structure {
	
	private int yearOfCreation;
	private double cost;
	
	public Structure(int year, double cost) {
	
		this.yearOfCreation = year;
		this.cost = cost;
		
	}
	
	public int getYearOfCreation() {
		
		return yearOfCreation;
		
	}
	
	
	public double getCost() {
		
		return cost;
		
	}
	@Override
	public String toString() {
		
		return "year of Creation is: " + yearOfCreation + ", cost is: " + cost + ", ";
	
	}
	@Override
	public Structure clone() {
		
		return new Structure(this.yearOfCreation, this.cost);
		
	}
	
}
