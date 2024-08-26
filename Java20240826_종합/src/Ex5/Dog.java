package Ex5;

public class Dog extends Animal {

       int age;
	 
	    Dog(String name, int age){
	    	super(name);
	    	this.age = age;
	    }
	
	    public Dog() {
			
		}
	
       int getAge() {
    	   return age;
       }
       
       @Override
       void info() {
 //   	   System.out.println(getName()+"입니다.");
    	   super.info();
    	   System.out.println(age+ "살 입니다.");
    	   
       }
       
     @Override
  	 void speak() {
  		 System.out.println("멍멍~");
  	 }
	
     
     
}
