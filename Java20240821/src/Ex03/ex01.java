package Ex03;


public class ex01 {

	public static void main(String[] args) {
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
	
	// 매개변수 없는 값이 디폴트 생성자
	abc(){
		System.out.println("디폴트 생성자");
	}
	
   // this 자기 객체를 호출
	abc(String n){
//		name = n;
//		age = 10;
//		phone = "010-9999-9999";
		this(n,10,"000-9999-2222");
		
	}
	
	abc(String n, int a){
//		name = n;
//		age = a;
//		phone = "010-9999-9999";
		this(n,a,"000-1111-2222");
	}
	
//	abc(String n, int a, String p){
//		name = n;
//		age = a;
//		phone = p;
//	}
	
	//호출
	abc(String name, int age, String phone){
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	
	
	
	// 값을 반환하지 않음을 의미. 이 메서드는 호출되면 어떤 값을 돌려주지 않고 작업만 수행합니다.
	void info() {
		System.out.printf("이름: %s, 나이: %d, 전화번호:%s\n", name , age, phone);
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
	
