import java.util.Scanner;

public class Hero {
	private String weapon = "ひのきのぼう";
	private int money = 1000;
	private int attackPower = 40;

	
	Scanner sc = new Scanner(System.in);

	
	void changeWeapon(String newWeapon) {
		this.weapon = newWeapon;
		System.out.println(newWeapon + "を装備しました");
	}

	void selectAction(int command) {
		if (command == 1) {
			System.out.println("攻撃します");
		} else if (command == 2) {
			System.out.println("防御します");
		} else if (command == 3) {
			System.out.println("道具を使います");
		} else {
			System.out.println("コマンドがありません");
		}
	}

	void checkPurchace(int price) {
		if (money >= price) {
			System.out.println("購入できます");
			System.out.println("買いますか？");
			String judge = sc.next();
			if (judge.equals("はい")) {
				System.out.println("購入処理");
			} else if (judge.equals("いいえ")) {
				System.out.println("了解です");
			} else {
				System.out.println("えらー");
			}
		} else {
			System.out.println("所持金が足りません");
		}
	}

	void attack(int enemyDefense) {
		int damage = attackPower - enemyDefense;
		System.out.println("敵に" + damage + "ダメージ");
	}

}