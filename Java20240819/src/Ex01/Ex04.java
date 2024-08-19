package Ex01;

public class Ex04 {
	
	public static void main(String[] args) {
		
	// 2의배수  3의 배수 아닌 값 출력	

	int sum =0;
	for(int i=0; i<=10; i++) {
		
		if(i % 2 == 0 || i % 3 == 0) continue;
	
		System.out.print(i+ ",");
	}
	
	
	}

}
