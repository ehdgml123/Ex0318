package ex13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;





public class TreeSet02 {

	public static void main(String[] args) {
		
		//TreeSet ==> 자동 정렬(오름차순)
		TreeSet<String> set = new TreeSet<String>();
       // Set<Integer> set = new TreeSet<Integer>();  -> 가능 
    
    set.add("kor");
    set.add("eng");
    set.add("KOR");
    set.add("ENG");
    set.add("Math");
    set.add("math");
    set.add("abc");
    
        
     Iterator<String> itr =  set.iterator();
	 
     while(itr.hasNext())
    	 System.out.println(itr.next() + " ");    // 대문자 부터 출력(아스키코드)
     System.out.println("--------------------------------");
	
	}       

}
