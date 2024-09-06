package Thread;

import static util.MyLogger.log;



public class ThreadStateMmain {

	public static void main(String[] args) throws InterruptedException {
           
		Thread thread = new Thread(new MyRunnable(), "MyThread");
		   log("mhThread.state1 =" + thread.getState()); // new
		   log("myThread start()");
		   thread.start();
		   Thread.sleep(1000);
		   log("myThread.stat3= +" +  thread.getState()); //TIMED_WAITING
		   Thread.sleep(4000);
		   log("myThread.stat5= +" + thread.getState());   //TERMINATED
		   log("main end");
		   
	   
	}
	
  static class MyRunnable implements Runnable{

	@Override
	public void run() {
		try {
			log("start"); 
			log("myThread.stat2= +" + Thread.currentThread().getState());  // RUNNABLE
			log("sleep() start");
			Thread.sleep(3000);
			log("sleep() end");
			log("myThread.stat4= +" + Thread.currentThread().getState());  // RUNNABLE
			log("myThread end");
		}catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
	  
  }



}
