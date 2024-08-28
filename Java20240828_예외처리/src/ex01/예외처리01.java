package ex01;

import java.util.Scanner;

public class 예외처리01 {

	public static void main(String[] args) {
		
		
		/*
		 * 예외처리 안되어있는 문장
		 *
		 */
		
		int num1, num2 ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수 입력하세요");
		num1 =  sc.nextInt();
		sc.nextLine();
		num2 = sc.nextInt();
		
		double result = (double)num1 / num2;
		
		System.out.println("두 정수 나눈 결과" + result);
		
		System.out.println("프로그램 종료!!!!!!!");

		
		
	}

}
