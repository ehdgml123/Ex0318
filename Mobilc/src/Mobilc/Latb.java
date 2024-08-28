package Mobilc;

public class Latb extends Mobilc{
	

	public Latb() {
		
	}
	
    
	
	public Latb(String mobileName,  int batterySize, String osType) {
		super( mobileName, batterySize,osType);
	}
	
	@Override
    void operate(int time) {
		int batteryUsage = time * 10;
		batterySize -= batteryUsage;
		System.out.println(batterySize);
		  
	}
	
	
	@Override
	void charge(int time) {
		int batteryUsage = time * 10;  
		batterySize += batteryUsage;
		System.out.println(batterySize);
		
	}
	
	
	
	
	
}
