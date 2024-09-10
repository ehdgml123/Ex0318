package ex02;

import java.util.Arrays;

public class MyFirstStream {

	public static void main(String[] args) {
		
		// 문자열 길이값 출력
		String[] arr = {"AA", "BBB", "CCCC", "DdDDD", "EEEEEE"};
		
	   for(String str: arr) {
		   System.out.print(str.length()+ " ");
	   }
	   
	   System.out.println();
	                                 //n.length()-> 문자열 길이 구함
	   Arrays.stream(arr).map(n -> n.length()).forEach(n -> System.out.print(n));
	/*
	 *  Arrays.stream(arr)는 배열 arr의 요소들을 스트림으로 변환. 
	 *   즉, 배열에 있는 문자열들을 순차적으로 처리할 수 있는 스트림을 생성
	 * */  
	                                      // mapToInt -> int형 으로 
	   long total = Arrays.stream(arr).mapToInt(n -> n.length()).sum();
	   System.out.println("\n" + total);
	}

}

/*
 *map -> 변환 작업(transformation)을 수행하는 메서드로, 
 *       스트림에 들어 있는 요소를 내가 원하는 방식으로 가공하거나 바꿀 때 사용
 */
 