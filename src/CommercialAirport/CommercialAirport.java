package CommercialAirport;

import FX_W20PKG.Airport;

public class CommercialAirport extends Airport {

	private int numOfGates;
	
	public CommercialAirport(int year, double landSpace, int runways, String code, int gates) {
		
		super(year, landSpace, runways, code);
		this.numOfGates = gates;
		
	}
	
	public int getNumOfGates() {
		
		return numOfGates;
		
	}
	@Override
	public String toString() {
		
		return super.toString() + "and its number of gates is " + numOfGates;
		
	}
	@Override
	public CommercialAirport clone() {
		
		Airport ap = super.clone();
		return new CommercialAirport(ap.getYearOfCreation(), ap.getCost(), ap.getNumOfRunways(),
			ap.getCode(), this.getNumOfGates());
		
	}
	
}
