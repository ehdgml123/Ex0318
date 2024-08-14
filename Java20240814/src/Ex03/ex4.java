package Ex03;

public class ex4 {
	
	public static void main(String[] args) {
		
		int kor = 61;
		
		               // 국어가 80 이상이면 우수 60 이상이면 보통 미만 이면 부발   
		String result = (kor >= 80) ? "우수" : (kor >= 60) ? "보통" : "분발";
		
		System.out.println(result);
		
		
	}

}
