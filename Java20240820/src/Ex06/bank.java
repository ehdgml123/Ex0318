package Ex06;



public class bank {

	public static void main(String[] args) {
		
        
		bank1 pepl = new bank1();
		pepl.number = "1215-45-55";
		pepl.name = "이동희";
		pepl.pri = 50;
	    pepl.info();	
	    pepl.입금(10000);
	    pepl.출금(300);
	    pepl.잔액();
	    pepl.info();
	
	}
	
	
}

class bank1{
	
	String number;
	
	String name;
	
	int pri;
	
	
	void 입금(int money) {
		 pri += money;
		 System.out.println(pri);
		 
		 
	}
	// void 는 반환값 이 없으므로 자동으로 출력되지 않는다.
	void 출금(int money) {
		 pri -= money;
		 System.out.println(money);
	}
	
	void 잔액() {
		System.out.println("잔액:"+pri);		
	}
	
	void info() {
		System.out.println("계좌번호 :"+number + ", 이름:"+ name+", 잔액:"+ pri);
	}
	
	
}
