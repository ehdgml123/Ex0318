package ex04;

import java.util.Scanner;

public class ex5 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("계절  입력>>");
		
		
	   int num = sc.nextInt();
	   sc.nextLine();	   
	   
	   
	   
	   String result="";   // 스캔 콘솔창에 키보드 로 입력하기 때문에 빈 문자열 로 한다.
	   
	   if(num == 12 || num == 1 || num == 2 ){
		   
		    result ="겨울";
		   
	   }else  if(num == 3 || num == 4 || num == 5){
		   
		    result = "봄";
		    
	   }else if(num == 6 || num == 7 || num == 8){
		   
		    result = "여름";
		    
	   }else if(num == 9 || num == 10 || num == 11){
		   
		    result = "가을";
		    	
	   }
	   
	   System.out.println(result);	

	}
	

}
