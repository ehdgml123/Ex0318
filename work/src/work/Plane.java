package work;

public class Plane {
	
	   String planeName;
	   int fuelSize;
	   
	   
	
	public Plane() {
		
	}
	
	public Plane(String planeName, int fuelSize) {
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
	
	public void flight(int distance) {
		
	}
	
	public void refuel(int fuel) {
		
	}
	
	     @Override
	    public String toString() {
	        return planeName + " " + String.format("%04d", fuelSize);
	    }

}
