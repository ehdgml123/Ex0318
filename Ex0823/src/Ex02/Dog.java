package Ex02;

public class Dog extends Vehicle {
		
 public static void main(String[] args) {
	 
	 Dog sp = new Dog("강아지");
	 sp.sound();
	 
}	
	
	
	public Dog(String name) {
		super(name);
		
	}

	@Override
	public void sound() {
		super.sound();
	}

}
