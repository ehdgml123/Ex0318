package Ex6;


public class Animalmain {

	public static void main(String[] args) {
	
	     
	     Dog dog = new Dog("강아지", 5);
	     dog.speak();

        
	     System.out.println("------------------------");
	     
	     Cat cat = new Cat("고양이", 5);
	     cat.speak();
	     
	     Cow cow = new Cow();
	     cow.speak();  // null 값 
	}

}
