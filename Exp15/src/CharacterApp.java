
//進行管理（司令塔）
import java.util.Random;
import java.util.Scanner;

class CharacterApp {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();

	void start(Character chara) {

		System.out.println("===キャラクターメイク===");
		//名前
		System.out.print("名前を入力してください：");
		chara.decideName(sc.next());
		//職業選択
		System.out.println("職業：１：自分で入力　２：おまかせ");
		if (sc.nextInt() == 1) {
			String job = sc.next();
			chara.setJob(job);
		} else {
			chara.setJob("無職");
		}
		//所持金選択
		System.out.println("所持金：１：自分で入力　２：おまかせ");
		if (sc.nextInt() == 1) {
			chara.setMoney(sc.nextInt());
		} else {
			chara.setMoney(rand.nextInt(400) + 100);
		}
		compleat(chara);
	}

	void compleat(Character chara) {
		System.out.println();
		System.out.println("＝＝＝キャラクター完成＝＝＝");
		System.out.println("名前：" + chara.getName());
		System.out.println("職業：" + chara.getJob());
		System.out.println("所持金：" + chara.getMoney() + "G");
		System.out.println("HP：" + chara.getHp());
		System.out.println("こうげき：" + chara.getAttack());
		System.out.println("ぼうぎょ：" + chara.getDefense());
	}

}