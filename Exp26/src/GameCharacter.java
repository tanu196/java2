public class GameCharacter {
	String name;
	int hp;

	void showStatus() {
		System.out.println(name + "HP：" + hp);
	}
	
	static int partyGold = 1000;
	
	static void showGold() {
		System.out.println("パーティの所持金：" + partyGold + "G");
	}
}

class Warrior extends GameCharacter{

	public Warrior(String string) {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public Warrior() {}

}

class Mage extends GameCharacter{}