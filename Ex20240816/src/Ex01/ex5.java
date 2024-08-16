package Ex01;

import java.util.Scanner;

public class ex5 {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);	
	
	
	
	int[] score = new int[5];
	
	for(int i=0; i<5; i++) {
		System.out.printf("%d번재 학생 com점수 입력>>", i+1);
		score[i] = sc.nextInt();
	}
	
	for(int i=0; i<5; i++) {
	System.out.println(score[i]);
		
	}
	
	int max = 0;
	for(int i=0; i<5; i++) {
		 if(score[i] > max) {
			  max = score[i];
		 }
		 System.out.println("최대값 :"+ max);
	}
	
	int sum = 0;
	 for( int i=1; i<5; i++) {
		 sum += score[i];
	 }
	 
	 System.out.println("최대값:"+ sum);
	
	 double avg = sum / 0.5;
	 
	 System.out.println("평균 : "+ avg);

	 
	 
	 
	 
	 
	 for(int i=0; i<5-1-i; i++) {
		 
		 for(int j=0; j<5-1; i++) {
                    			 
			 if(score[j] > score[j+1]) {
				 int tmp = score[j];
				 score[j] = score[j+1];
				 score[j+1] = tmp;
			 }
		 }
	 }
	 
	 System.out.println("출력:");
	for(int i=0; i<score.length; i++) {
		 System.out.println(score[i]+", ");
	}
	
	 
	}

}
	 

