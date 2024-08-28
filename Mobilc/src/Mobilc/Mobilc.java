package Mobilc;

public abstract class Mobilc {
	
    String mobileName;
	
	int batterySize;
	
	String osType;
	
	public Mobilc() {
		
	}
	
	public Mobilc(String mobileName,int batterySize, String osType) {
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	
   abstract void operate(int time);
	
	abstract void charge(int tile);
	
	public String getmobileName() {
		  return getmobileName();
	}
	
	int getbatterySize() {
		return getbatterySize();
	}
	
	public String getosType() {
		  return getosType();
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	
	
}
