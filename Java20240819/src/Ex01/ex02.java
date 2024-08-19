package Ex01;

public class ex02 {
	
	public static void main(String[] args) {
		
		int i =0, sum =0, count;
		sum = i = count = 0;
		for(; i<10000;) {
			
			
		if(sum > 20)
			break;
		
		
			sum +=i;
		count++;
			i++;
		}
		
		System.out.printf("sum: %d, count: %d\n", sum, count);
	}

}
