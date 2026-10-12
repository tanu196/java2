
//進行管理（司令塔）
import java.util.Random;
import java.util.Scanner;

class CharacterApp {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	void start(Character chara) {
		//名前
		System.out.println("名前を入力してください");
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
		if(sc.nextInt() == 1) {
			
		}
		
		
	}

}