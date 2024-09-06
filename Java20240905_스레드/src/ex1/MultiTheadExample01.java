package ex1;

public class MultiTheadExample01 {

	public static void main(String[] args) {
		
		Runnable task1 = new Runnable() {
			
			@Override
			public void run() {
			
				try {
				for(int i=0; i<=20; i++) {
					if(i%2 ==0)
						System.out.print(i + " ");
				  //첫 for문 실행하고  1초 기달렸다가 다시 for문 실행
//				   Thread.sleep(1000);
				  }
				}catch (Exception e) {
					   e.printStackTrace();
				}
			}
		};
		
		
      Runnable task2 = () -> {   // 람다 표현식 
			
				try {
				for(int i=0; i<=20; i++) {
					if(i%2 ==1)
						System.out.print(i + " ");
			
//				   Thread.sleep(1000);
				  }
				}catch (Exception e) {
					   e.printStackTrace();
				}
			};
			
			Thread thread1 = new Thread(task1);
			Thread thread2 = new Thread(task2);

			thread1.start();
			thread2.start();
			
	}
       // cup 가 알아서 출력하여 우리는 출력하는 값 이 어떻게 나오는지 모른다.
}
