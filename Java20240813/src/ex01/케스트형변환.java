package ex01;

public class 케스트형변환 {

   public static void main(String[] args) {
	 
	   short s1;
	   int num1= 32768;
	   
	   s1 = (short)num1;
	   
	   System.out.println(s1);
	   
	   double d1 = 10.2;

//               강제형변환    
	   int num2 = (int)d1;  //double 를 int 를 강제로 형변환 한다
	   
	   System.out.println(num2);
	   
   }
	 
	
}
