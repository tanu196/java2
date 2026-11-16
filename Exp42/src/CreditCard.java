public class CreditCard implements PaymentProcessor{
	@Override
	public void pay(int amount) {
		System.out.println("カード決済：" + amount + "円");
	}
	
	
	
}
