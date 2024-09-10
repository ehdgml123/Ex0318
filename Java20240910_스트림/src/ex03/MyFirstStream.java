package ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyFirstStream {

	public static void main(String[] args) {
		
		// 문자열 길이값 출력             // 수정불가 
		List<String> list = Arrays.asList("AA", "BBB", "CCCC", "DdDDD", "EEEEEE");
		
//		list = new ArrayList<>(list);  // -> 이렇게 하면 수정 가능 
	    
		list.stream().map( n -> n.length()).forEach(n -> System.out.println(n));
		
		int count = list.stream().mapToInt(n -> n.length()).sum();
		System.out.println("\n" + count);
	
	}

}
