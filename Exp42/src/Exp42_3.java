public class Exp42_3 {
	public static void main(String[] args) {
		CreditCard card = new CreditCard();
		
		PaymentProcessor payment = card;
		Refundable redund = card;
		
		payment.pay(3000);
		redund.refund(3000);
		
		
		
		
		
	}
}
