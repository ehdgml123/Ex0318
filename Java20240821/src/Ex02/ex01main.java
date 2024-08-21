package Ex02;

public class ex01main {

	public static void main(String[] args) {
		
		// new abc() -> 객체생성 or 인스턴스 생성
		// abc() (생성자(디폴트 생성자) 또는 함수) 호출
		abc s1 = new abc();
		s1.info();
		 
		           
		abc s2 = new abc("차은우", 30, "010-1111-2222");
		s2.info();
		
		abc s3 = new abc("홍길동", 19, "11-2222-2222");
		s3.info();
		
		abc s4 = new abc("지리산");
		s4.info();
		
		abc s5 = new abc("지리산", 30);
		s5.info();
	}

}
