package Mobilc;

public class Otab extends Mobilc {
	
	
	
	public Otab() {
		
	}
	
	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}

	@Override
	void operate(int time) {
		int batteryUsage = time * 12;
		batterySize -= batteryUsage;
		setBatterySize(batteryUsage);
		
		
	}

	@Override
	void charge(int time) {
		int batteryUsage = time * 8;  
		batterySize += batteryUsage;
		setBatterySize(batteryUsage);
	}
	
    
	

}
