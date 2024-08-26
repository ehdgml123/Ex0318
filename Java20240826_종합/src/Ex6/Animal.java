package Ex6;


abstract class Animal{ //  추상클래스(미완성클래스) -> 객체생성불가
	    
		  private String name;
		  
		  public Animal() {
			
		  }
		  
		  //생성자()
		  public Animal(String name) {
			  this.name = name;
		  }
		
//		 void speak() {
//			 
//		 }
		 
          abstract void speak(); 
		 
		 void info() { 
			 
			 System.out.println(name+"입니다."); 
			 
		 }
	
		 
		 String getName() {
			 return name;
		 }
		 
		 void setName(String name) {
			 this.name = name;
		 }
		 
		 
	}



