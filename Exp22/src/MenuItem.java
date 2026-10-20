public class MenuItem {
	private String name ;
	private int price;
	
	public MenuItem(String name , int price) {
		this.name = name;
		this.price = price;
	}
	String getName() {
		return name;
	}
	
	int getPrice() {
		return price;
	}
	
	
}