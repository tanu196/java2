public class Exp23_1 {
	public static void main(String[] args) {

		Weapon weapon = new Weapon("鉄の剣", 15, 300);

		System.out.println("武器名：" + weapon.getName());
		System.out.println("攻撃力：" + weapon.getPower());
		System.out.println("価格：" + weapon.getPrice() + "円");

	}
}