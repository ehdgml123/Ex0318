package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class HashMapLab1 {

	
	
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Map<String, Integer> countries = new HashMap<>();

	        while (countries.size() < 5) {
	            System.out.print("나라이름을 입력하세요: ");
	            String country = sc.nextLine();

	         
	            if (countries.containsKey(country)) {
	                System.out.println("나라명 " + country + "는 이미 저장되었습니다.");
	                continue; 
	            }

	            System.out.print("인구 수를 입력하세요: ");
	            int population = sc.nextInt();
	            sc.nextLine();  

	            
	            countries.put(country, population);
	            System.out.println("저장되었습니다.");
	        }

	        System.out.println("\n5개가 모두 입력되었습니다.");
	        System.out.print("입력된 데이터: ");

	       
	        for (Map.Entry<String, Integer> entry : countries.entrySet()) {
	            System.out.print(entry.getKey() + "(" + entry.getValue() + ")");
	            if (countries.size() > 1) {
	                System.out.print(", ");
	            }
	        }
	    }

}
