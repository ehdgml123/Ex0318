package work;

public class Airplane extends Plane {
	
	private static final int FUEL_CONSUMPTION_PER_10KM = 30;
	
	public Airplane() {
		
	}
	
	public Airplane(String planeName, int fuelSize) {
		super( planeName, fuelSize);
	}
	
	
	
	@Override
    public void flight(int distance) {
		
		 int requiredFuel = (distance / 10) * FUEL_CONSUMPTION_PER_10KM;
	        if (getFuelSize() >= requiredFuel) {
	            setFuelSize(getFuelSize() - requiredFuel);
	        } 
	          
	}
	
	@Override
    public void refuel(int fuel) {
        setFuelSize(getFuelSize() + fuel);
    }

}
