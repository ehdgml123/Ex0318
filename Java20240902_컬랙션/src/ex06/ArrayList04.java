package ex06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Iterator;




public class ArrayList04 {

	public static void main(String[] args) {
		
		// ArrayList 랑 LinkedList 같은 값 나옴 
		
		
	    // 출력 => Iterator
	//	List<String> list = new ArrayList<String>();
        Set<String> list = new HashSet<String>();   // -> 종북 완됨 저장 할때 순서 유지 안됨
		
		

        list.add("Kor");
        list.add("Kor");
        list.add("Kor1");
        list.add("eng");		
        list.add("math");		
        list.add("com");	
        
        
//        for(String str : list)
//        	System.out.println(str);
        
        
        
       Iterator<String> itr = list.iterator();   // 반복자 획득
       
                // 
       while(itr.hasNext())
    	   System.out.print(itr.next()+ " ");
       System.out.println();
       System.out.println("----------------------");
       
       itr = list.iterator();   // 반복자 획득
       
       while(itr.hasNext())
    	   System.out.print(itr.next()+ " ");
       System.out.println(); 
      
   
	

        
	}       

}
