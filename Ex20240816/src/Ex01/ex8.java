package Ex01;

import java.util.Scanner;

public class ex8 {
	
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[5];
		
		for(int i=0; i<5; i++) {
			score[i] = (int)(Math.random()*500);
		}
		
		for(int i=0; i<5; i++) {
			System.out.println(score[i]);	
		}
		for(int i=0; i<5; i++) {
			System.out.println(score[4-i]);	
		}
		

       int max = 0;
       for(int i=0; i<5; i++) {
    	   if( score[i] > max ) {
    		    max = score[i];
    	   }
    	   
    	   System.out.println("최대값:"+ max);
       }
       
       int min = 0;
       for(int i=0; i<5; i++) {
    	   if(score[i] < min ) {
    		    min = score[i];
    	   }
    	   
    	   System.out.println("최소값:"+ min );
       }
       
       int sum = 0;
       for(int i=0; i<5; i++) {
    	   sum +=  score[i];
       }
       
       System.out.println("총합:"+ sum);
       
	
     double avg = sum / 0.5;
     System.out.println("평균값 :"+ avg);
    	
	}
	
}