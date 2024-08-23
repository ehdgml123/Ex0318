package Ex03;

public class PersonMain  {
	
	public static void main(String[] args) {
		
		Person person = new Person("홍길동",20);
		
		person.introduce();
		person.walk();
		
		
		System.out.println("---------------------------------");
		
		
		Student student = 
				 new Student("홀길동",30 ,"아주대학교", "123456");
		
		student.introduce();
		student.walk();
		student.study();
		
		System.out.println("---------------------------------");

		
		SalesMan salesMan = new SalesMan("가나다",20, "삼성", 1000);
		
		salesMan.introduce();
		salesMan.walk();
		salesMan.work();
		
		System.out.println("---------------------------------");
        
		PartTimeStudent partTimeStudent = 
				 new PartTimeStudent("홍수빈", 20, "아주대", "12346578", "구내서점", "10000");
		
		
		partTimeStudent.work();
		partTimeStudent.job();
	    
		
	}

}


/*
 * 
 * */
 