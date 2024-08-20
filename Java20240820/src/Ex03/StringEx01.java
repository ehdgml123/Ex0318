package Ex03;

import java.util.Scanner;

public class StringEx01 {

	public static void main(String[] args) {
		
		int[] nArr = {1,2,3,4,5};
		
		nArr[3] =30;
		
		for(int i=0; i<nArr.length; i++) {
		System.out.print(nArr[i]);
		
		}
		
		String str1 = "korea";
		String str2 = new String ("12325-123456");
		
		
		System.out.printf("\n",str1 == str2 );
		
		Scanner sc = new Scanner(System.in);
		
	   char c= str1.charAt(3);
		
	   System.out.println(c);
	   
	   char c2 = str2.charAt(3);
	   String s = (c2 == 1)? "남":"여";
	   
	   System.out.println(s);
	   
        String s2 = "dsfsadfsad";
        		
        char c1 =1;
        char c3 = '1';
        
        System.out.println();
        
        int len = str1.length();
        System.out.println("len :" + len);

        
        
        String oldStr = "java programing";
        
        String newStr = oldStr.replace("java", "Spring");
        
        System.out.println(oldStr);
        System.out.println(newStr);
        
        
       String sub1 = oldStr.substring(3);
       System.out.println(sub1);
       
                                   // 5 에서 9 전까지 
       String sub2 =oldStr.substring(5,9);
    		   System.out.println(sub2);
    		   
      	// 찾는 문자열 위치	   
      int len2  =oldStr.indexOf("prog");		   
	  System.out.println(len2);
	  
	  
	 String board = "국어,영어,수학,컴퓨터";
	                            // 분리
	 String[] sArr = board.split(",");
	 
	 for(int i=0; i< sArr.length; i++) 
		 System.out.println(sArr[i]);
		 
		 String phone = "010-1234-5487";
		 
		 
		 String[] phone2 = phone.split("-");
		 for(int i=0; i<phone2.length; i++) 
			 System.out.println(phone2[i]);
		 
		 
		 String str3 = "com";
		 String str4 = "com";
		 System.out.println(str3 == str4);
		
		 
		 String str5 = new String("com");
		 String str6 = new String("com");
		 System.out.println(str5 == str6);
		 
	 
		 boolean b = str3.equals(str4);
		 System.out.println(b);

		 boolean b2 = str5.equals(str6);
		 System.out.println(2);
		 
		 
		 //String oldStr = "java programing";
		                           // 첫번쩨 문자열이 java 로 시작하냐
		 System.out.println(oldStr.startsWith("java"));
		 
		 String str7 = "   java String   ";
		 System.out.println(str7.length());
		 
		 String str8 = str7.trim();
		 System.out.println(str7);
		 System.out.println(str8);
		 
		 System.out.println(str8.toUpperCase());
		 System.out.println(str8.toLowerCase());
		 
	}

}
