public class Drink {
	private int price;
	
	public Drink(int price){
		this.price = price;
	}
	
	
	public void showPrice() {
		System.out.println("価格："  + price + "円");
	}
}