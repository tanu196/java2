//public class Weapon {
//
//	
//	private String name;
//	private int power;
//	private int price;
//
//	Weapon(String name , int power , int price){
//		this.name = name;
//		this.power = power;
//		this.price = price;
//	}
//
//	String getName() {
//		return name;
//	}
//	
//	
//	int getPower() {
//		return power;
//	}
//	
//	int getPrice() {
//		return price;
//	}
//}


record Weapon(String name , int power , int price) {}