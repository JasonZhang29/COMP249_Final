package CargoAirport;

import FX_W20PKG.Airport;

public class CargoAirport extends Airport {

	private double landedWeight;
	
	public CargoAirport(int year, double cost, int runways, String code, double weight) {
		
		super(year, cost, runways, code);
		this.landedWeight = weight;
		
	}
	
	public double getLandedWeight() {
		
		return landedWeight;
		
	}
	@Override
	public String toString() {
		
		return super.toString() + "and its landed weight is: " + landedWeight;
		
	}
	@Override
	public CargoAirport clone() {
		
		Airport ap = super.clone();
		return new CargoAirport(ap.getYearOfCreation(), ap.getCost(), ap.getNumOfRunways(),
			ap.getCode(), this.landedWeight);
		
	}
	
}
