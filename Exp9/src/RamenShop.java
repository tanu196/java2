public class RamenShop {
	String customerName;
	int totalPrice = 0;
	
	
	void reserveSeats(String name , int people) {
		customerName = name;
		int seat = 10;
		
		if(seat == 0) {
			System.out.println("本日の営業は終了しました");
		}else if(seat <= people) {
			System.out.println("座席を確保できないです");
		}else {
			System.out.println(name + "様" + people + "名の座席を確保しました");
		}
	}
	
	
	void showMenu() {
		System.out.println("""
				1:しょうゆラーメン　７５０円
				2:みそラーメン　８５０円
				3:塩ラーメン　８００円""");
	}
	
	void orderRamen(int menuNumber , int quantity) {
		int price;
		switch(menuNumber) {
		case 1 : price = 750;break;
		case 2 : price = 850;break;
		case 3 : price = 800;break;
		default : price = 0;
		}
		int subtotal = price * quantity;
		totalPrice += price * quantity;
		System.out.println("小計：" + subtotal + "円");
	}
	
	
	void showTotal() {
		System.out.println("合計金額：" + totalPrice + "円");
	}
	
	
	void showWelcome() {
		System.out.println("いらっしゃいませ");
		System.out.println("お名前を入力してください：");
		System.out.println("人数を入力してください：");
	}
	
	int checkout(int payment) {
		
		if(totalPrice > payment) {
			System.out.println("不足しています");
		}else {
			totalPrice = 0;
		}
		return payment - totalPrice; 
	}
}
