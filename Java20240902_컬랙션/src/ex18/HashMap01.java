package ex18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class HashMap01 {

	public static void main(String[] args) {
	
		// key : 중복 x, value: 중복 ok 
		//  >>>> 순차 출력(반북문, iterator)
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		
		map.put(1, "kim");
		map.put(2, "park");
		map.put(3, "hong");
		map.put(4, "Lee");
		map.put(4, "cho");
		map.put(3, "sujin");
		
		Set<Integer> set = map.keySet();
		for(Integer n : set)
			System.out.print(n + " ");
		System.out.println();
		System.out.println("-----------------------------");
		
		for(Integer n : set)
			System.out.println(map.get(n));
		System.out.println("-----------------------------");
		
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			  System.out.println(map.get(itr.next()));
		}
		
		
//		System.out.println(map.get(1));
//		System.out.println(map.get(2));
//		System.out.println(map.get(3));
//		System.out.println(map.get(4));
//		System.out.println("-------------------------");
	
		
		
		
		
	}

}
