package Ex01;


public class ex01 {

	public static void main(String[] args) {
		
		
		    //abc 를 잠조변수
		abc ldh = new abc();
//		ldh.age = 50;
//		ldh.name = "이동희";
//		ldh.phone = "010-9999-9999";
		ldh.info();
		
		abc 동희 = new abc();
//		동희.name = "이동희";
//		동희.age = 28;
//		동희.phone = "010-1500-0687";

		
// 멤버변수는 private 를 붙인다, 외부에 공개하지 않기 위해서		
		
// 멤버변수는 외부 공개하지 않는다
// 그러면
// int a;
//   a =10;
//   System.out.println(a); -> 즉, a변수를 초기화 해야한다.
// 마찬가지로 멤버변수를 반드시 초기화 해야한다.
//		 초기화 방법 2 가지 1. 생성장 , 2. setter 
		
/*
 * 
 * 
 * 
 * 
 * 
 * */		
		
	}
	

}

class abc{
  
	// 변수 생성
	private String name;
  
	private int age;
	
	private String phone;
	
	
	void infoAge(int age) {
		if(age>0 && age<120) {
			age = age;
		}
	}
	
	
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
