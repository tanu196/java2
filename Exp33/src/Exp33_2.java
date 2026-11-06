public class Exp33_2 {
	public static void main(String[] args) {
		Coffee coffee = new Coffee(350);
		Drink drink = coffee;
		
		coffee.showPrice();
		drink.showPrice();
	}
}