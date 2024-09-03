package ex06;

interface CCC{
	int max(int a, int b);
}

interface BBB{
	
	int printVar(String name, int i);
}

interface AAAA{
	int square(int x);
}

interface NNN{
	int roll();
}

interface MMM{
	int sumArr(int[] arr);
}


public class test {

	public static void main(String[] args) {

		CCC c1 =   (a,b) -> a > b ? a : b;
	   
		
	   System.out.println("------------------------------------");
	   
	   BBB b1 = (name, i) -> {
		    System.out.println(name + "=" + i);
		    return i;
		};
		   
	   
	   System.out.println("------------------------------------");
	   
	   AAAA a1 = x -> x * x;
	    
	   System.out.println("------------------------------------");
	   
	   	NNN n1 = () -> {
		   return (int) (Math.random()*6);
	   };
	   
	   System.out.println("------------------------------------");

	   
	   MMM m1 = (int[] arr) ->{
		   int sum =0;
		   for(int i : arr)
			   sum +=i;
		   return sum;
	   };
	   
		
		
		
	}

}
