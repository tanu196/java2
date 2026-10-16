public class Product {
	private int productId;
	private String name;
	private int price;
	
	public Product(int productId , String name , int price) {
		this.productId = productId;
		this.name = name;
		this.price = price;
	}
	
	int getProductId() {
		return productId;
	}
	
	String getName() {
		return name;
	}
	
	int getPrice() {
		return price;
	}

}