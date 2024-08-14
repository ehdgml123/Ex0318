package ex01;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1변재 정수 입력 >>");
		                                                              // 중수 연산 정수 = 정수
	     int num1 = sc.nextInt();                                     // 정수 연산 실수 = 실수
	                                                                  // 정수 or 실수 연산 문자 =  문자
	     System.out.println("2변재 정수 입력 >>");            
	     int num2 = sc.nextInt();

	     
	     int sum = num1 + num2;
	     
	     double avg = sum/0.2;     // 나눗셈 연산 
	     
	     System.out.println("두 합의 값은:"+sum+ "입니다");
		
	     System.out.println("두 평군 값은:"+avg+ "입니다");
		}
		{
			
			
			
			
		}
		
	}

}
