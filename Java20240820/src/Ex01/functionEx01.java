package Ex01;

public class functionEx01 {

	public static void main(String[] args) {
	
		func1(); 

		func2(11); 

		int n =func3(15);
		if(n ==1) System.out.println("홀수");
		else System.out.println("짝수");
	}

	  
	static void func1() {
		System.out.println("매개변수(함수에게 값입력하지 않는다), 반환타입 함수!");
		 
	}
	
	static void func2(int num) {
		 if(num%2 == 0)
			 System.out.println("입력값 은 짝수!");
		 else
			 System.out.println("입력값 은 홀수!");
	}
	
	
	 static int func3(int num) {
		 if(num % 2 ==0)
			 return 0;
		 else
			 return 1;
			 
		 
	 }
	
	
}
