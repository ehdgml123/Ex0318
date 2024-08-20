package Ex02;

public class functionEx4 {
	
	public static void main(String[] args) {
	
		//정수 값 10넘겨주면 함수에서 1 ~ 10 까지 평균 리턴
		double result = func1(100);

		System.out.println(result);
		
	}
	
   	    
	static double func1(int n) {
		
		int sum = 0;
		
		
		for(int i=0; i<=n; i++)
			sum += i;
		
		return (double)sum/n;
	}
	

}
