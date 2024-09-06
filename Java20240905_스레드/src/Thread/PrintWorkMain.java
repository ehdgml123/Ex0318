package Thread;

public class PrintWorkMain {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new PrintWork("A", 1000), "Thread-A");
		Thread thread2 = new Thread(new PrintWork("B", 500), "Thread-B");
		
		thread1.start();
		thread2.start();

	}

}
