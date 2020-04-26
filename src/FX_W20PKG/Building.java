package FX_W20PKG;

public class Building extends Structure {

	private double landSpace;
	private String material;
	
	public Building(int year, double cost, double landSpace, String material) {
		
		super(year, cost);
		this.landSpace = landSpace;
		this.material = material;
		
	}
	
	public double getLandSpace() {
		
		return landSpace;
		
	}
	
	public String getMaterial() {
		
		return material;
		
	}
	@Override
	public String toString() {
		
		return super.toString() + "landspace is: " + landSpace + 
			", material is: " + material + ", ";
	
	}
	@Override
	public Building clone() {
		
		Structure str = super.clone();
		return new Building(str.getYearOfCreation(), str.getCost(), this.landSpace, this.material);
		
	}
	
}
