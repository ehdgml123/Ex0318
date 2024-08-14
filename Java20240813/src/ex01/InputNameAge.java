package ex01;

import java.util.Scanner;

public class InputNameAge {

	public static void main(String[] args) {
          
		 Scanner sc = new Scanner(System.in);   // 객체 생성
		 
		 System.out.println("이름을\t 입력하세요:");
		 
		 String a  = sc.nextLine();    // 문자열 입력하면, 입력한 문자 a  로 대입하고 넘어간다.
		 
		 System.out.println("나의 이름은"+a+ "입니다");
		 
		 System.out.println("나이 입력하세요:");
		 
		 int b = sc.nextInt();        // 문자열 입력하면, 입력한 문자 b  로 대입하고 넘어간다.
		 
		 System.out.println("나의 나의은"+b+ "입니다");
		 
		 
		 System.out.println("프로그램 종료!");
		 
		 
		 

	}

}


// sc.nextLi