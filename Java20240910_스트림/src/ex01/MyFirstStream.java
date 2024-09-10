package ex01;

import java.util.Arrays;

public class MyFirstStream {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		
		int total = Arrays.stream(arr).filter(n -> n%2 == 1 ).sum();  // 필터링 
		
		System.out.println(total);
		
		System.out.println("------------");
		
	    long count = Arrays.stream(arr).filter(i -> i%3 == 0).count();
      
	     System.out.println(count);
	  
	     System.out.println("-----------");
	     
	    Arrays.stream(arr).forEach( n -> System.out.print(n + " "));
	}

}
/*
 * filter 
 * - 스트림내 요소에 대해서 필터링하는 작업
 *   주어진 조건 을 만족하는 요소만 스트림에 남기고, 조건을 만족하지 않는 요소들은 제외
 */
 