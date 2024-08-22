package Ex04;

public class Car {
	
	static int totalCars;
	
	static String name;
	
	public Car(String name) {
		System.out.println("차량 구입, 이름: " + name);
		this.name = name;
		totalCars++;
		}
	
	// static 이므로 객체를 생성을 안하고 호출가능
		public static void showTotalCars() {
		System.out.println("구매한 차량 수: " + totalCars);
		}

 
	 
}
