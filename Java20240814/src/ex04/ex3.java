package ex04;

import java.util.Scanner;

public class ex3 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주차 시간을 입력하세요>>");
		
	   double hours = sc.nextDouble();
	   
	   int fee;
	   
	   
	   if(hours <=1) {
		   fee = 1000;
	   }else if(hours <=2) {
		   fee = 2000;
	   }else if(hours <=3) {
		   fee = 3000;
	   }else {
		    fee = 5000;
	   }
      
	   System.out.println("주차요금:" + fee + "원");

	
		
	}
	

}
