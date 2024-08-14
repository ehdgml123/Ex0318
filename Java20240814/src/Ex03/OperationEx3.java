package Ex03;

public class OperationEx3 {
	
	public static void main(String[] args) {
	
		int num = 4000;

		int hours = num / 3600;  
		int Seconds = num % 3600; 
		int minutes = Seconds / 60; 
		int seconds = Seconds % 60; 

		System.out.printf("%d시간 %d분 %d초.\n", hours, minutes, seconds);

		
		
	}
	
	
	
	

}
