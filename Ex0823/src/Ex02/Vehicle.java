package Ex02;

public class Vehicle {
	
	String name;
	
	public Vehicle(String name) {
		this.name = name;
	}
	
	public void sound() {
		System.out.println("동물이 소리를 냅니다");
		System.out.println(name+"소리를 냅니다");
	}

}
