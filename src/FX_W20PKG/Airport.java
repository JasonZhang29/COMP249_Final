package FX_W20PKG;

public class Airport extends Structure {

	private int numOfRunways;
	private String code;
	
	public Airport(int year, double cost, int runways, String code) {
		
		super(year, cost);
		this.numOfRunways = runways;
		this.code = code;
		
	}
	
	public String getCode() {
		
		return code;
	
	}
	
	public int getNumOfRunways() {
		
		return numOfRunways;
		
	}
	@Override
	public String toString() {
		
		return super.toString() + "number of runways is " + numOfRunways + 
			", code is " + code + ", ";
		
	}
	@Override
	public Airport clone() {
		
		Structure str = super.clone();
		return new Airport(str.getYearOfCreation(), str.getCost(), this.numOfRunways, this.code);
		
	}
	
}
