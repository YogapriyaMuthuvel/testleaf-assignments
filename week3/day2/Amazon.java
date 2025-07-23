package week3.day2;

public class Amazon extends CanaraBank {

	@Override
	public void cashOnDelivery() {
		System.out.println("Payment method: Cashondelivery");
		
	}

	@Override
	public void upiPayments() {
		
		System.out.println("Payment method: UPI payment");
	}

	@Override
	public void cardPayments() {
		System.out.println("Payment method: Card payment");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("Payment method: Internet Banking");
		
	}
	
	public void recordPaymentDetails() {
		super.recordPaymentDetails();
		System.out.println("Payment Details recorded");
	}
	
	
	public static void main(String[] args) {
		
		Amazon option = new Amazon();
		option.cardPayments();
		option.cashOnDelivery();
		option.internetBanking();
		option.upiPayments();
		option.recordPaymentDetails();
	}

}
