package Ex01;

import java.util.Random;

public class 로또2 {
	
	public static void main(String[] args) {
	
		
		// 내가 한거
//		int lotto[] = new int[6];
//	
//	for(int i=1; i<=5; i++) {
//	
//		 lotto[i] = (int)(Math.random()*45)+1;
//		
//	for(int j=0; j<i; j++)
//	   if(lotto[i] == lotto[j]) {
//		   i--;
//	   }
//	   continue;
//	}
// System.out.println("로또번호");
//
// for(int i=1; i<6; i++) {
//		System.out.println(lotto[i]+"");
//	}
		
// 강사님 코드
    int[] lotto = new int[6];
    Random random = new Random();
    
    for(int i=0; i<5; i++) {
    	for(int j=0; j<6; j++) {
    		int tmp = random.nextInt(45)+1;
    		boolean flag = false;
    		
    		for(int k=0; k<j; k++) {  // 같은 숫자 중복체크
    	 if(lotto[k] ==tmp) {
    		 flag = true;
    		 j--;
    		 break;
    	 }
    	}
    	
    	if(flag == false) {
    		lotto[j] = tmp;
    		System.out.print(lotto[j]+",");
    		
    	}
    }
    System.out.println();
		
	
	}
		
	}
	}
