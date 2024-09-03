package ex06;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaPractice {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        
        // 1. 짝수만 필터링                                      // n 은 number 
        List<Integer> evenNumbers = filterEvenNumbers(numbers, n -> n % 2 == 0);
        for(int i : evenNumbers)
        	System.out.print(i + "");
        System.out.println("\n-------------------------------");
        
        // 2. 짝수의 제곱 구하기
        List<Integer> squaredNumbers = map(evenNumbers, n -> n * n);
        
        for(int i : squaredNumbers)
        	System.out.print(i + " ");
        System.out.print("\n------------------------------");
        
        // 3. 결과 출력
        forEach(numbers, n -> System.out.print(n + " "));
    }

    // 짝수만 필터링하는 메소드
    public static List<Integer> filterEvenNumbers(List<Integer> numbers, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (predicate.test(number)) {
                result.add(number);
            }
        }
        return result;
    }
    
    
    // 숫자를 제곱하는 메소드
    public static List<Integer> map(List<Integer> numbers, Function<Integer, Integer> function) {
    	  List<Integer> result = new ArrayList<>();
          for (Integer number : numbers) {
              result.add(function.apply(number));
          }
          return result;
      }
    

    // 숫자를 출력하는 메소드
    public static void forEach(List<Integer> numbers, Consumer<Integer> consumer) {
    	  for (Integer number : numbers) {
              consumer.accept(number);
          }
    }
}
