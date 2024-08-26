package Ex3;


public class Animalmain {

	public static void main(String[] args) {
	
	     
	     Dog dog = new Dog("강아지", 5);
	     dog.info();
	     dog.speak();
//	     System.out.println(dog.age+"살 입니다");
        
	     System.out.println("------------------------");
	     
	     Cat cat = new Cat("고양이", 5);
	     cat.info();
	     cat.speak();
	}

}
