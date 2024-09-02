package ex10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Iterator;


class Num{
	private int num;
	
	public Num(int num) {
		this.num = num;
	}
	
	
	@Override
	public String toString() {
		 
	//	return num + " ";  // 10 + "" -> "10"   정수 를 문자로 반환 
	    return String.valueOf(num);   // 10 을 문자 "10" 반환 
	
	}
	
	@Override
	public int hashCode() {
		
		return num % 5;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		/*
		Num  n = (Num)obj;
		
		
		if(this.num == n.num)
		   return true;
		else 
		   return false;
		   */
		return this.num == ((Num)obj).num  ? true : false;
	}
	
}


public class HashSet04 {

	public static void main(String[] args) {
		
	
		
	    // Num 클래스만 가능 
        Set<Num> set = new HashSet<Num>();   // -> 종북 완됨 저장 할때 순서 유지 안됨
                                                   // -> 중복 해도 출력 되는것은 중복제외 만 출력
		
        set.add(new Num(10));
        set.add(new Num(20));
        set.add(new Num(20));
        set.add(new Num(30));
        set.add(new Num(40));
  
       	
               
        
       Iterator<Num> itr = set.iterator();   // 반복자 획득
       
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
