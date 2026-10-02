public class Hero {
	private String weapon = "ひのきのぼう";
	
	void changeWeapon(String newWeapon) {
		this.weapon = newWeapon;
		System.out.println(newWeapon + "を装備しました");
	}
	
	void selectAction(int command) {
		if(command == 1) {
			System.out.println("攻撃します");
		}else if(command == 2) {
			System.out.println("防御します");
		}else if(command == 3) {
			System.out.println("道具を使います");
		}else {
			System.out.println("コマンドがありません");
		}
	}
	
}