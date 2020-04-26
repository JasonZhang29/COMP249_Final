package FX_W20PKG;

public class Bridge extends Structure {

	private double length;
	private double height;
	
	public Bridge(int year, double cost, double length, double height) {
		
		super(year, cost);
		this.length = length;
		this.height = height;
		
	}
	
	public double getLength() {
		
		return length;
		
	}
	
	public double getHeight() {
		
		return height;
		
	}
	@Override
	public String toString() {
		
		return super.toString() + "length is " + length + ", height is " + height + ", ";
	
	}
	@Override
	public Bridge clone() {
		
		Structure str = super.clone();
		return new Bridge(str.getYearOfCreation(), str.getCost(), this.length, this.height);
		
	}
	
}
