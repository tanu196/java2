import java.util.Scanner;

public class Hero {
	private String name;
	private int hp; 
	private int mp;
	private int attackPower;
	
	
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getMp() {
		return mp;
	}


	public void setMp(int mp) {
		this.mp = mp;
	}


	public int getAttackPower() {
		return attackPower;
	}


	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}


	void encourage() {
		System.out.println("今日も元気に魔王討伐");
	}
	
	void introduce() {
		System.out.println("わたしは勇者" + name + "!");
	}
	
	void attack() {
		int damage = attackPower + 5;
		System.out.println(name + "の攻撃" + damage + "ダメージを与えた！");
	}
	
	void magicAttack() {
		if(mp >= 2) {
			
		mp -= 2;
		int damage = attackPower  * 3;		
		System.out.println(name + "の魔法攻撃" + damage + "ダメージを与えた！");
		}else {
			System.out.println("mpがたりない");
		}
	}
	
	void heal() {
		hp += 10;
		System.out.println("HPが10回復した！");
	}
	
	void levelUp() {
		hp += 5;
		mp += 2;
		attackPower += 3;
		
		System.out.println("""
				レベルアップ！
				HPが５上がった！
				MPが２上がった！
				攻撃が３上がった！
				現在のステータス
				""");
		System.out.println("HP:" + hp);
		System.out.println("MP:" + mp);
		System.out.println("攻撃:" + attackPower);	
	}
	
	void chageName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("新しい名前を入力してください：");
		String changeName =  sc.next();
		this.name = changeName;
		System.out.println("名前を" + changeName + "に変更しました。");
	}
	
	
	
	
	
}
