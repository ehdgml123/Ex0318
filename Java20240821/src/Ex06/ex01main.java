package Ex06;

public class ex01main {

	public static void main(String[] args) {
		
		abc s1 = new abc();
		
	// 정적메소드
		s1.setName("차은우");
		System.out.println(s1.getName());
		
//		System.out.println(abc.job);
//		
//		abc.change("차승우");
//		System.out.println(abc.job);
		
		
		abc s2 = new abc();
// 클래스 명, 정적메소드
		s2.change("접근가능");
		
	
	}

}
