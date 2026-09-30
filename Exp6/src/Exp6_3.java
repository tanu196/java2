import java.util.Scanner;

public class Exp6_3 {
	public static void main(String[] args) {
		Hero hero1 = new Hero();
		hero1.setName("ヨシヒコ");
		hero1.setHp(7);
		hero1.setMp(2);
		hero1.setAttackPower(12);
//		hero1.levelUp();

		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		
		n: while (!flag) {
			System.out.println("操作番号を入力して");
			System.out.println("""
					１:やる気出す　\
					２：自己紹介　\
					３：回復　\
					４：名前変更　\
					５：魔法攻撃　\
					６：終了
					""");

			int judge = sc.nextInt();
			switch (judge) {
			case 1:
				hero1.encourage();
				break;
			case 2:
				hero1.introduce();
				break;
			case 3:
				hero1.heal();
				break;
			case 4:
				hero1.chageName();
				break;
			case 5:
				hero1.magicAttack();
				break;
			case 6:
				System.out.println("ありがとうございました。");
				break n;
			}
		}

	}
}
