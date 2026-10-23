public class Food {
	private String name;
	private int price;
	
	void showInfo() {
		System.out.println(name + ":" + price + "円");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
}