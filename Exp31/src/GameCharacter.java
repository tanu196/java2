public class GameCharacter {
	private String name;
	private int hp;

	
	GameCharacter(){}
	GameCharacter(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	final public void showStatus() {
		System.out.println("名前：" + this.name);
		System.out.println("HP：" + this.hp);
	}

	public void attack() {
		System.out.println("攻撃！");
		System.out.println("7 ダメージを与えた");
	}

	public void specialMove() {
		System.out.println("全力攻撃！てやぁっ！！");
		System.out.println("20 ダメージを与えた");
	}
}