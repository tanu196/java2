interface PaymentProcessor {
	int MAX_AMOUNT = 10000;
	
	void pay(int amount);
}