package Ex01;

public class Account {

	
		int balance = 0;
		
		void deposit(int amount) {
			
			balance += amount;
		}
		
		void withdraw(int amount) {
			
			if(balance >= amount) {
				balance -= amount;
			}else {
				  System.out.println("잔액부족"); 
			}
		}
			
       int agtBalance() {
	     return balance; 
      }

}
