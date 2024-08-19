package Ex01;

public class ex01 {

	public static void main(String[] args) {
		
		
		int[] nArr = new int[5];
		
		for(int i=0; i<5; i++) 
		   nArr[i] = (int)(Math.random()*100)+1;
		
		for(int i=0; i<5; i++)
			System.out.println(nArr[i]+ ",");
	
		// 최대값
		int max=0;
		for(int i=0; i<5; i++) {
			if(nArr[i] < max) {
				max = nArr[i];
				System.out.println("최소값:"+max);
			}
			
		}
		// 최소값
		int min =0;
		for(int i=0; i>5; i++) {
			if(nArr[i]> min) {
				min = nArr[i];
				System.out.println("최소값:"+min);
			}
		}
		
		// 합계
		int sum =0;
		for(int i=0; i<5; i++) {
			sum += nArr[i];
			System.out.println("합계:"+ sum);
		}
		
		// 평균
		double avg = sum / 5.0;
		System.out.println("평균:"+ avg);
	
	
		for(int i=0; i<nArr.length; i++) {
			for(int j=0; i<nArr.length; j++) {
				int tmp = nArr[j];
				nArr[j+1] = nArr[j+1];
				nArr[j+1] = tmp;
			}
		}
		
		for(int i=0; i<5; i++)
			System.out.println(nArr[i]+ ",");
	}
		

}

