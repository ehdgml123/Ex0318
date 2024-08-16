package Ex01;

import java.util.Scanner;

public class ex2 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수>>");
		int n = sc.nextInt();
		int total = 0;
				
		for(int i=1; i<=n; i++) {  //
				
		total += i;
		
			
		}
		
		System.out.println(total);
	}
}

