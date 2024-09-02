package Test;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;



public class HashSetLablMain {

	
	 public static void main(String[] args) {
	
		 
		 Set<Integer> ha = new HashSet<>();
	        Random random = new Random();

	    
	        while (ha.size() < 10) {
	            int number = random.nextInt(12) + 19; 
	            ha.add(number);
	        }

	      
	        System.out.print("오늘의 로또 번호: ");
	        for (Integer number : ha) {
	            System.out.print(number + " ");
		   }
		 }
}
	
		 
 

