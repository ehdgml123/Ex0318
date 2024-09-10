package ex05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyFirstStream {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("alice", "bob", "charlie");
		
		
		//대문자로 출력
		list.stream()
		.map(str -> str.toUpperCase())  // 대문자 변환
		 .forEach(n -> System.out.println(n));
		
		
		//대문자로 변환된 데이터를 리스트에 저장
		List<String> upperCaseName = list.stream()
				          .map(str -> str.toUpperCase())
				          .collect(Collectors.toList());
		                 // .toList();   
		
	    System.out.println(upperCaseName);
	    
	    
	    int[] arr = {1,2,3,4,5,6,7,8};
	    
	    Arrays.stream(arr)
	     .filter(n -> n%2 ==0)
	     .forEach(n -> System.out.println(n + " "));
	    System.out.println();
	    
	    List<Integer> iList = Arrays.stream(arr)
	    		.filter(n -> n%2 ==0)
	    		.boxed()
	    		.toList();    //Arras.asList() -> 변경불가   결론은 .toList 를 사용하면 수정 안됨 
	    System.out.println(iList);
	    
	    
	    
	    
	    
	    List<Integer> iList2 = Arrays.stream(arr)
	    		.filter(n -> n%2 ==0)
	    		.boxed()
	    		.collect(Collectors.toList());
	    System.out.println(iList2);
	    
	    iList2.add(10);
	    System.out.println(iList2);
	}

}
