package Ex01;

public class PersonMain {
	
	public static void main(String[] args) {
		
		Person person = new Person("홍길동",20);
		
		person.introduce();
		person.walk();
		
		
		System.out.println("---------------------------------");
		System.out.println("---------------------------------");
		
		Student student = 
				 new Student("홍길동", 20, "아주대학교", "123456");
		
		student.introduce();
		student.walk();
		student.study();
		
		System.out.println("---------------------------------");

		
		SalesMan salesMan = new SalesMan("홍길동", 20, "삼성", 1000);
		
		salesMan.introduce();
		salesMan.walk();
		salesMan.work();
		
		
	}

}


/*
 * 
 * */
 