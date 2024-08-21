package Ex05;

public class ex01main {

	public static void main(String[] args) {
		
		// new abc() -> 객체생성 or 인스턴스 생성
		// abc() (생성자(디폴트 생성자) 또는 함수) 호출
		abc s1 = new abc();
		s1.info();
		 
		           
		abc s2 = new abc("차은우", 30, "010-1111-2222");
		s2.info();
		s2.nameInfo();
		
		
	    s2.nameChange("차은우");
	    s2.nameInfo();
	    
	    s2.getName();
	    s2.setName("가나다");
		
	
	}

}
