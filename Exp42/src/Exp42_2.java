public class Exp42_2 {
	public static void main(String[] args) {
		PaymentProcessor[] payments = {
				new CreditCard(),
				new ElectoronicMoney(),
				new CreditCard()
		};
		
		for(PaymentProcessor pays : payments) {
			pays.pay(3000);
		}
		
		
		
		
		
		
	}
}