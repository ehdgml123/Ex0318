package ex01;

public class Ex01 {
	
	public static void main(String[] args) {
	
     int num1 = 20;
     int num2 = 10;
     
    
     
     System.out.println("before----------------");
     System.out.println("num1:"+num1+ ",num2:"+ num2);

     int tmp = num1;
     
     num1 = num2;
     num2 = tmp;
     
     System.out.println("after----------------");
     System.out.println("num1:"+num1+ ",num2:"+ num2);
     
     
	}
		

}
