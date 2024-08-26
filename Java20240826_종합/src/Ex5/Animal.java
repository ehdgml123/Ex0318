package Ex5;


class Animal{
	    
		  private String name;
		  
		  public Animal() {
			
		  }
		  
		  //생성자()
		  public Animal(String name) {
			  this.name = name;
		  }
		
		 void speak() {
			 
		 }
		 
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



