package FX_W20PKG;

public class Overpass extends Bridge {

	private double maxLoad;
	
	public Overpass(int year, double cost, double length, double height, double maxLoad) {
		
		super(year, cost, length, height);
		this.maxLoad = maxLoad;
		
	}
	
	public double getMaxLoad() {
		
		return maxLoad;
		
	}
	@Override
	public String toString() {
		
		return super.toString() + "and its max load is " + maxLoad;
	
	}
	@Override
	public Overpass clone() {
		
		Bridge bdg = super.clone();
		return new Overpass(bdg.getYearOfCreation(), bdg.getCost(), bdg.getLength(), 
			bdg.getHeight(), this.maxLoad);
		
	}
	
}
