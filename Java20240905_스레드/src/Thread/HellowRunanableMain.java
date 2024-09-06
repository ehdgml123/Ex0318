package Thread;

public class HellowRunanableMain {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName()+ "Main() start");

		HellowRunnable hellowThread = new HellowRunnable();
        Thread thread = new Thread(hellowThread);
		
		
		thread.start();
	
	
		System.out.println(Thread.currentThread().getName()+ "Main() end");
		
		

	}

}
