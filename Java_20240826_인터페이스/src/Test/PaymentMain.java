package Test;

public class PaymentMain {
	
	public static void main(String[] args) {
	
		CreditCardPayment cr = new CreditCardPayment();
		PayPalPaymen py = new PayPalPaymen();
		CashPayment cs = new CashPayment();
		 
		 cr.makePayment(1000);
		 py.makePayment(5000);
		 cs.makePayment(3000);
	}
	
	 
	 
}
