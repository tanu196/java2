public class Ninja extends GameCharacter {
	public void specialMove() {
		System.out.println("連続攻撃！しゅっ！！");
		for (int i = 0; i < 3; i++) {
			System.err.println("７００ダメージ与えた！");
		}
	}
}