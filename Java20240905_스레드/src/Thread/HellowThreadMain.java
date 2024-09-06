package Thread;

public class HellowThreadMain {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName()+ "Main() start");

		HellowThread hellowThread = new HellowThread();
		
		System.out.println(Thread.currentThread().getName()+" start() 호출 전");
		
		hellowThread.start();
		System.out.println(Thread.currentThread().getName()+" start() 호출 후");
	
		System.out.println(Thread.currentThread().getName()+ "Main() end");
	}

}
