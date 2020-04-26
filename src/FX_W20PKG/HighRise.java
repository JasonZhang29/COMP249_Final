package FX_W20PKG;

public class HighRise extends Building {

	private double height;
	
	public HighRise(int year, double cost, double landSpace, String material, double height) {
		
		super(year, cost, landSpace, material);
		this.height = height;
		
	}
	
	public double getHeight() {
	
		return height;
		
	}
	@Override
	public String toString() {
		
		return super.toString() + "and its height is: " + height;
	
	}
	@Override
	public HighRise clone() {
		
		Building bld = super.clone();
		return new HighRise(bld.getYearOfCreation(), bld.getCost(), bld.getLandSpace(),
			bld.getMaterial(), this.height);
		
	}
	
}
