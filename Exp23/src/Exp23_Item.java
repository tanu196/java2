public class Exp23_Item {
	public static void main(String[] args) {
		Item item = new Item("ノート" , 180 ,"note" );
		
		System.out.println("商品名：" + item.name());
		System.out.println("価格：" + item.price() + "円");
		System.out.println("商品名:" + item.discription());
		
		
		String n = "これから";
		int total = 0;
		switch(n) {
		case "2" -> total++;
		case "1" -> total++;
		default -> total += 2;
		};
		System.out.println(total);}
}
