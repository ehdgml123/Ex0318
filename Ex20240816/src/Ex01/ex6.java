package Ex01;


public class ex6 {
	
	public static void main(String[] args) {
	
		int[] score = {50,20,5,40,50};
		
		int max =0;
		for(int i=0; i<5; i++) {
			max += score[i]; 
		}
		
		System.out.println("합계"+ max);
		
		System.out.println("------------------");
		
		int sum = score[0];
		for(int i=1; i<score.length; i++) {
			if(sum < score[i]) {
				
				sum = score[i];
				
			}
			System.out.println("최대값:"+sum);
		}
	}
}
