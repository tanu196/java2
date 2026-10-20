public class Order {
	private MenuItem item;
	private int quantity;
	
	public Order(MenuItem item , int quantity) {
		this.item = item;
		this.quantity = quantity;
	}
	

	int calculateTotal() {
		return item.getPrice() + quantity;
	}
	
	void showOrder() {
		System.out.println(item.getName() +  quantity );
		System.out.println("合計金額：" + calculateTotal());
	}
	
	
	
	
}