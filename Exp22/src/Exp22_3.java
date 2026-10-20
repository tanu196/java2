public class Exp22_3 {
	public static void main(String[] args) {
		
		MenuItem item = new MenuItem("ハンバーガー" , 350);
		MenuItem item2 = new MenuItem("ポテト" , 200);
		
		Order order1 = new Order(item , 2);
		Order order2 = new Order(item2 , 1);
		
		order1.showOrder();
		order2.showOrder();
		
		
	}
}