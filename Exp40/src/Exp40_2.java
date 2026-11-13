public class Exp40_2 {
	public static void main(String[] args) {
		Monster[] monsters = {
				new Dragon("フレイムドラゴン" , 60),
				new Ghost("シャドウゴースト" , 35),
				new Dragon("アイスドラゴン" , 45)
		};
		
		for(Monster arr : monsters) {
			arr.showName();
			System.out.println(arr.calculateDamage());
		}
		
		
		
	}
}