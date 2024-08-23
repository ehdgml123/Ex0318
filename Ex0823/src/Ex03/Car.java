package Ex03;

public class Car extends Vehicle {
  
	String fuelType;
	   int seatingCapacity;
	   
	   public Car(String licensePlate, String owner,
	         String fuelType, int seatingCapacity) {
	      super(licensePlate, owner);      
	      this.fuelType = fuelType;
	      this.seatingCapacity = seatingCapacity;
	      
	   }
	   @Override
	   double calculateMaintenanceCost() {
	      return seatingCapacity* 10000.0;
	   }
	   
	   void printInfo() {
	      super.printInfo();
	      System.out.println("연료 타입 : " + fuelType);
	      System.out.println("탑승 인원 : " + seatingCapacity);
	      System.out.println("정비 비용 : " + calculateMaintenanceCost());
	   }

	
}
