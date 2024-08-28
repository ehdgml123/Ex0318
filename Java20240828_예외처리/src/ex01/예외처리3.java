package ex01;

import java.util.Scanner;

public class 예외처리3 {

	public static void main(String[] args) {
		
		
		/*
		 * 예외처리  if~ try-catch
		 *
		 */
		
		int num1, num2 ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수 입력하세요");
		
		num1 =  sc.nextInt();
		
		sc.nextLine();
		
		num2 = sc.nextInt();
		
		double result = 0;
		
		//try -> 문제가 될 소지가 있는 경우 try{} 기입
		try{
			 result = num1/ num2;
		
			 // catch -> 예외(문제)가 발생하면 처리하는 불럭
		}catch (Exception e) {
			
			e.printStackTrace();  // 발생 근원지 를 찾아서 단계별로 출력하는거
			System.out.println("---------------");
			System.out.println(e.getMessage());  // 에러 원인을 간단하게 출력하는거 
		}
		
		System.out.println("두 정수 나눈 결과" + result);
		
		System.out.println("프로그램 종료!!!!!!!");

		
		
	}

}
