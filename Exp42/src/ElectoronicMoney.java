class ElectoronicMoney implements PaymentProcessor{
	@Override
	public void pay(int amount) {
		System.out.println("電子マネー決済：" + amount + "円");
	}
}
