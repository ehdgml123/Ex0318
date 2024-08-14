package Ex03;

public class test {

	public static void main(String[] args) {
		
		 int score = 85;
		 
		 char grade = (score > 90) ? 'a' : ((score > 80) ? 'b':'c');
		 System.out.println(score + "점은"+ grade + "입니다");

	}

}
