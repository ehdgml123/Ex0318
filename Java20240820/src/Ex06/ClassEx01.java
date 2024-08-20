package Ex06;

import java.util.Scanner;

public class ClassEx01 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		Student ldh = new Student();
		ldh.age = 50;
		ldh.name = "이동희";
		ldh.phone = "010-9999-9999";
		ldh.info();
		
		Student 동희 = new Student();
		동희.name = "이동희";
		동희.age = 28;
		동희.phone = "010-1500-0687";

	}
	

}

class Student{
  
	String name;
  
	int age;
	
	String phone;
	
	void info() {
		System.out.printf("이름: %s, 나이: %d, 전화번호:%s\n", age , name, phone);
	}
	
	void 입실() {
		System.out.println("입실하다");
	}
	
	void 퇴실() {
		System.out.println("퇴실하다");
	}
	
	void 조회() {
		System.out.println("조퇴하다");
	}	
	
  
}
