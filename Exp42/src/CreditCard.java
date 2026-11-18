public class CreditCard implements PaymentProcessor , Refundable{
	@Override
	public void pay(int amount) {
		System.out.println("カード決済：" + amount + "円");
		
	}
	
	public void refund(int amount) {
		System.out.println("カード返金：" + amount +"円");
	}
	
	
	
}
