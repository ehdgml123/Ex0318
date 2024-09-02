package ex07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Iterator;




public class HashSet01 {

	public static void main(String[] args) {
		
	
		
	    //
        Set<String> set = new HashSet<String>();   // -> 종북 완됨 저장 할때 순서 유지 안됨
                                                   // -> 중복 해도 출력 하는거는 중복제외 만 출력
		
        set.add("Kor");
        set.add("Kor1");
        set.add("eng");		
        set.add("math");		
        set.add("com");	
               
        
       Iterator<String> itr = set.iterator();   // 반복자 획득
       
                // 읽어올 객체가 있으면 true , 없으면 false;
       while(itr.hasNext())
    	                      /*
    	                      next() -> 컬렉션에서 하나의 객체를 읽어온다.
    	                      next()를 호출하기 전에 hasNext()를 통해 읽어올 다음 요소가 있는지 먼저 확인하는 것
    	                         */
    	   System.out.print(itr.next()+ " ");
       System.out.println();
       System.out.println("----------------------");
       
       itr = set.iterator();   // 반복자 획득
       
       while(itr.hasNext())
    	   System.out.print(itr.next()+ " ");
       System.out.println(); 
      
   
	

        
	}       

}
