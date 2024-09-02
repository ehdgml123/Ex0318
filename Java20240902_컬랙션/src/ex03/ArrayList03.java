package ex03;

import java.util.ArrayList;


public class ArrayList03 {

	public static void main(String[] args) {
		
		
	    // 타입 제한  => String
		ArrayList<String> list = new ArrayList<String>();
		

        list.add("Kor");
        list.add("eng");		
        list.add("math");		
        list.add("com");		
        
        
        
        for(int i=0; i<list.size(); i++)
        	System.out.println(list.get(i)+ " ");
        
        list.remove(0);  // -> 0 번째 배열 제거  
        list.set(1, "sss");   // 인덱스 1 번째 "sss" 로 변경
         
         for(Object obj : list)
        	 System.out.print(obj + " ");
         
	}

}
