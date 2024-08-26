package Test;

public class PayPalPaymen implements Payment {

	@Override
	public void makePayment(double amount) {
	System.out.println("PayPal로" +amount+"원을 결제합니다.");
		
	}

}
