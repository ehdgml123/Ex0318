package ex01;

import java.util.Scanner;

public class InputNameAge {

	public static void main(String[] args) {
          
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("이름을\t 입력하세요:");
		 
		 String a  = sc.nextLine();
		 
		 System.out.println("나의 이름은"+a+ "입니다");
		 
		 System.out.println("나이 입력하세요:");
		 
		 int b = sc.nextInt();
		 
		 System.out.println("나의 나의은"+b+ "입니다");
		 
		 
		 System.out.println("프로그램 종료!");
		 
		 
		 

	}

}
