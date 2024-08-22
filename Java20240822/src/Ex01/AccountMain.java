package Ex01;

public class AccountMain {

	public static void main(String[] args) {
		
		Account acc = new Account();
		acc.deposit(10000);
		acc.withdraw(9000);
		acc.withdraw(1000);
		
	//	System.out.println("잔고 출력 :"+ acc.balance);
		System.out.printf("잔고 출력: %d\n"+ acc.agtBalance());
        
	}

}
