package Ex04;

class StaticEx{
	int count = 0;  // 멤버변수 , 인스턴스 변수
	static int cnt =0;  // 정적변수, 클래스 변수  // 공유차원 
  
	void func() {
		// 인스턴스변수, 클래스변수 사용가능, 인스턴스메소드, 클래스메소드 사용가능
	}
	
	
	  static void sfunc() {}
            // 클래스변수, 클래메스도만 사용사능, 인스터스변수, 인스턴스메소드 사용불가

}



public class StaticMain {

	public static void main(String[] args) {
		                                    // 함수 안에 있는거는 지역변수 
		StaticEx ex1 = new StaticEx();
		ex1.count++;
		
 		//Ex.cnt =  -> 클래스 변수(맨 앞 대문자)
		ex1.cnt++;  //1
		System.out.println(ex1.count+ "," + ex1.cnt);
		
		StaticEx ex2 = new StaticEx();
		ex2.count++;
		ex2.cnt++; //static 공유 차원 전 값이 1 이니깐 출력값이 2
		System.out.println(ex2.count+ "," + ex2.cnt);
		
		StaticEx ex3 = new StaticEx();
		ex3.count++;
		ex3.cnt++;
		System.out.println(ex3.count+ "," + ex3.cnt);

	}

}
