package ex04;

import java.util.Scanner;

public class ex4 {
	
	public static void main(String[] args) {
		
	int age = (int)(Math.random()*100)+1;
		
	
//    System.out.println((int)(Math.random())*100);		
		
	int fee = 2000;
	
	double rete = 0;
	
	if(age >= 65 || age<=5) {
		 rete = 0;
	}else if(age >=6 && age <=12) {
		  rete = 0.5;
	}else if(age >=13 && age <=18) {
		 rete = 0.75;
	}else if(age >=19 && age<=64){
		  rete = 1;
	}
	      int result = (int)(fee * rete);   
	      System.out.printf("나이 : %d버스 요금 :" + "%d원\n",age,result);
		
	}
	
	
   }
	   	


