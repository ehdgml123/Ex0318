package ex08;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Iterator;




public class HashSet02 {

	public static void main(String[] args) {
		
	
		
	    //
        Set<Integer> set = new HashSet<Integer>();   // -> 종북 완됨 저장 할때 순서 유지 안됨
                                                   // -> 중복 해도 출력 되는겂은 중복제외 만 출력
		
        set.add(10);
        set.add(20);
        set.add(30);	
        set.add(10);	        
        set.add(40);		
        set.add(50);	
               
        
       Iterator<Integer> itr = set.iterator();   // 반복자 획득
       
                // 
       while(itr.hasNext())
    	   System.out.print(itr.next()+ " ");
       System.out.println();
       System.out.println("----------------------");
       
       itr = set.iterator();   // 반복자 획득
       
       while(itr.hasNext())
    	   System.out.print(itr.next()+ " ");
       System.out.println(); 
      
   
	

        
	}       

}
