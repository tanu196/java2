class Book {
	private String title;
	private int price;
	private String category;

	Book(String title) {
		this(title, 1000);
	}

	Book(String title, int price) {
		this(title , price , "未分類");
	}

	Book(String title, int price, String category) {
		this.title = title;
		this.price = price;
		this.category = category;
	}

}