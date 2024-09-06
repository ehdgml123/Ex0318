package Thread;

import static util.MyLogger.log;

 class PrintWork implements Runnable {
	
	private String content;
	
	private int sleepMs;
	
    public PrintWork(String content, int sleepMs) {
	 this.content = content;
	 this.sleepMs = sleepMs;
	}

	@Override
	public void run() {
		while(true) {
		   log(content);
		   try {
			    Thread.sleep(sleepMs);
		   }catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
				
	}
}
