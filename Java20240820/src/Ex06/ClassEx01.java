package Ex06;

import java.util.Scanner;

public class ClassEx01 {

	public static void main(String[] args) {
		 
		
		//  ldh 라는 객체에 Student 인스터스 생성
		abc ldh = new abc();
		
		// Student 클래스 에서 정의된 변수를 ldh 에서 참고 하여 사용 가능 
		ldh.age = 50;
		ldh.name = "이동희";
		ldh.phone = "010-9999-9999";
		ldh.info();
		
		abc 동희 = new abc();
		동희.name = "이동희";
		동희.age = 28;
		동희.phone = "010-1500-0687";

	}
	

}

class abc{
  
	// 변수 생성
	String name;
  
	int age;
	
	String phone;
	
	
	// 값을 반환하지 않음을 의미. 이 메서드는 호출되면 어떤 값을 돌려주지 않고 작업만 수행합니다.
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
