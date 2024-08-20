package Ex02;

public class functionEx02 {
	
	public static void main(String[] args) {
	
		//정수 값 10넘겨주면 함수에서 1 ~ 100 까지 합구해서 리턴
		int result = func1(100);

		System.out.println(result);
		
	}
	
   	    
	static int func1(int n) {
		
		int sum = 0;
		
		
		for(int i=0; i<=n; i++)
			sum += i;
		
		return sum;
	}
	

}
