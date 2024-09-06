package ex06;


import java.util.function.BiFunction;


/*
 * 숫자 2개 전달하여 최대값 반환!
 * 
 * */
@FunctionalInterface
interface TriFunction<T,M,R,Q>{
	public Q apply(T n1, M n2,R n3);
}

public class Exam08 {

	public static void main(String[] args) {
		
		TriFunction<Integer, Integer, Integer, String> tri = (n1,n2,n3) -> String.valueOf(" " + n1 + n2+n3);
		
	
		
		String str = tri.apply(11, 22,33);
		System.out.println(str);
		
	}

}
