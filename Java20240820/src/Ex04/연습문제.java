package Ex04;

import java.util.Scanner;

public class 연습문제 {
	
	public static void main(String[] args) {
		
		String[] arr = new String[10];
		int index = 0;
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		
		
		while(flag) {
			System.out.println("--------------------");
			System.out.println("1.과목등록 | 2.과목목록 보고 | 3.종료");
			System.out.println("--------------------");
			System.out.println("선택:");
			int num = Integer.parseInt(sc.nextLine());
		// 	sc.nextLine();
				
			
			switch(num) {
			case 1:
				System.out.println("과목명입력>>>>");
			    arr[index++] = sc.nextLine();
			    sc.nextLine();
			    break;
			case 2:
				for(int i=0; i<index; i++)
					System.out.println(arr[i]+ ",");
			    break;
			case 3 :
				flag = false;
				break;
			} 
			
			
		}
		
		System.out.println("프로그램 종료");
		
	}

}
