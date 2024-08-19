package Ex01;

public class Ex5 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=0; i<=10; i+=2) 
			sum +=i;
		System.out.println(sum);

		sum =0;
		for(int i=1; i<=10; i++) {
			if(i %2 ==1) continue;
			sum += i;
		}
		System.out.println(sum);
		
	}

}
