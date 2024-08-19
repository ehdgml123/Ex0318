package Ex04;

import java.util.Scanner;

public class ex05 {
	
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 boolean run = true;
		 int bank = 0;
		 
		// while 문
		 while(run) {
			 System.out.println("----------------------");
			 System.out.println("1.예금 | 2.출금| 3.잔고| 4.종료");
			 System.out.println("----------------------");
			 System.out.print("선택:");
			 
			 int srtNum = scanner.nextInt();
			 
			 if(srtNum == 1) {
				 bank++;
				 System.out.println("예금액 출력");
				 int det = scanner.nextInt();
				 bank += det;
			 }else if(srtNum == 2) {                       // Integer.parseInt() 문자를 정수로 변환해주는 것
				 System.out.println("출금액 출력:");
				 int dow = scanner.nextInt();
				 bank -= dow;
			 }else if(srtNum == 3) {
				 System.out.println("잔고액 :"+ bank);
			 }else if(srtNum ==4) {
				 run = false;
			 }
		 }
		 
		 System.out.println("프로그램 종료");
	}

}
