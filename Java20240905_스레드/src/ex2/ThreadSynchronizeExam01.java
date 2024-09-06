package ex2;


class Counter{
	int count = 0;
	
	public void incremant() {
	     count++;	
	 
	}
	
	public void decremant() {
		 count--;
		
	}
	
	int getCount() {
		return count;
	}
	
}

public class ThreadSynchronizeExam01 {

	public static void main(String[] args) {

		Counter counter = new Counter();
		
		for(int i=0; i<=100; i++)
			counter.incremant();    // 100
		
		for(int i=0; i<=100; i++)    // 100 에서 - 
			counter.decremant();
		
		System.out.println("counter :"+counter.getCount());
	}

}
