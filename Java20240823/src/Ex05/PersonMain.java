package Ex05;

public class PersonMain  {
	
	public static void main(String[] args) {
		
		/*
		 * double d1 = 10.2;
		 * int num = 10;
		 * num = d1;
		 * d1 = sum; d1 = (double) num; 
		 * */		
	    
		// 상위클래스(Person)는 하위클래스(Student)를 참조할수 있다.
		// 단, 접근할 수 있는 영역은 상위클래스(Person) 내로 한정됨
		Person p1 = new Person();
	   
		Person ps1 = new Student();
	    
/// 이유 : s2 는 student 참조변수이기 때문
//		  student 와 person 정보를 다 사용할수 있다. 그러나 person 객체를 참조하며 그 객체안에는 person 정보만 잇기 때문에 제한
//		Student s2 = new Person();
		
		
	    Student s2 = (Student)ps1;	
		
	    
	//    Student s3 = (Student)p1; 에러	
	    
	    
	    
	    Person p2 = new PartTimeStudent();
	    
	    
	    Student s3 = (Student)p2;
	    
	    
	    PartTimeStudent pp3 = (PartTimeStudent)p2;
	    
		
		
		
		
		
//		// 하위클래스에는 상위클래스를 참조할수 없다.
//		// 간략: 
//		Student s1 = new Student();
//        
//		Student s2 = new PartTimeStudent();
//		
//	// Student s3 = new Person(); 에러
//		
//		PartTimeStudent ps3 =  new PartTimeStudent();
//		
//	//	PartTimeStudent ps1 =  new Student();  에러
//		
//	//	PartTimeStudent ps1 =  new Person();  에러
		
		
	}

}



 