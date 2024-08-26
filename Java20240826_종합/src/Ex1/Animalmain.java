package Ex1;

class Animal{
    
	  private String name;
	  
	  public Animal() {
		
	  }
	  
	  //생성자()
	  public Animal(String name) {
		  this.name = name;
	  }
	
	 void soeak() {
		 
	 }
	 
	 void info() { 
		 
		 System.out.println(name+"입니다."); 
		 
	 }
	
}


public class Animalmain {

	public static void main(String[] args) {
	
		int num = 10;
		
	    Animal animal = new Animal("동물");
	 
	     animal.info();

	}

}
