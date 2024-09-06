package Thread;

public class HellowThread extends Thread {

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() +": run()") ;
	}

	
}
