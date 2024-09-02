package ex04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ArrayList04 {

	public static void main(String[] args) {
		
		// ArrayList 랑 LinkedList 같은 값 나옴 
		
		
	    // 타입 제한  => String
		LinkedList<String> list = new LinkedList();
	//	List<String> list2 = new LinkedList(); -> 이렇게 해도됨
	//	List<String> list3 = new ArrayList<String>(); -> 이렇게 도 가능 
		
		

        list.add("Kor");
        list.add("eng");		
        list.add("math");		
        list.add("com");		
        
        
        
        for(int i=0; i<list.size(); i++)
        	System.out.println(list.get(i)+ " ");
        
        list.remove(0);  // -> 0 번째 배열 제거  
        
         
         for(Object obj : list)
        	 System.out.print(obj + " ");
         
	}

}
