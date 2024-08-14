package ex04;

import java.util.Scanner;

public class ex6 {
	
	public static void main(String[] args) {
		
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("몸무게(kg): ");
	        double weight = scanner.nextDouble();

	        System.out.print("키(m)");
	        double height = scanner.nextDouble();

	        double bmi = weight / (height * height);

	        if (bmi < 18.5) {
	            System.out.println("저체중");
	        } else if (bmi >= 18.5 && bmi <= 24.9) {
	            System.out.println("정상");
	        } else if (bmi >= 25 && bmi <= 29.9) {
	            System.out.println("과체중");
	        } else if (bmi >= 30) {
	            System.out.println("비만");
	        }

	     
	    }
	   


	}
	
