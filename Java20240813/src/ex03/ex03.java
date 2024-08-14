package ex03;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.println("실수 입력");

	        if (sc.hasNextFloat()) {
	            float num = sc.nextFloat();
	            System.out.println("입력된 실수 값은 " + num + "입니다");
	        } else {
	            System.out.println("입력된 값이 실수가 아닙니다.");
	        }

	        sc.close();
	   
	    	
		
		

	}

}
