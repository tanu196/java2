public class Exp23_2 {
	public static void main(String[] args) {
		Weapon weapon1 = new Weapon("鉄の剣" , 15 , 300);
		Weapon weapon2 = new Weapon("魔法の杖" , 200 , 134);
		
		System.out.println("武器名：" + weapon1.name());
		System.out.println("攻撃力：" + weapon1.power());
		System.out.println("価格：" + weapon1.price());
		
		System.out.println("武器名：" + weapon2.name());
		System.out.println("攻撃力：" + weapon2.power());
		System.out.println("価格：" + weapon2.price());
		
	}
}