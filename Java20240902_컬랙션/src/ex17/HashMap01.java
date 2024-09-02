package ex17;

import java.util.HashMap;


public class HashMap01 {

	public static void main(String[] args) {
	
		// key : 중복 x, value: 중복 ok 
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		
		map.put(1, "kim");
		map.put(2, "park");
		map.put(3, "hong");
		map.put(4, "Lee");
		map.put(4, "cho");
		map.put(3, "sujin");
		
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(3));
		System.out.println(map.get(4));
		

	}

}
