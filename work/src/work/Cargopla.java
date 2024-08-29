package work;

public class Cargopla extends Plane {
	
	private static final int FUEL_CONSUMPTION_PER_10KM = 50; 
	
	public Cargopla() {
		
	}

	
	public Cargopla(String planeName, int fuelSize) {
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
