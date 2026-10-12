//キャラクターの情報を持つだけのクラス

import java.util.Random;

class Character {
	private String name;
	private int money;
	private String job;
	private int hp;
	private int attack;
	private int defense;

	Random rand = new Random();
	
	
	public Character() {
		this.hp = rand.nextInt(50)+100;
		this.attack = rand.nextInt(20)+20;
		this.defense = rand.nextInt(20)+20;
	}

	String decideName(String name) {
		this.name = name;
		return name;
	}
	
	void setJob(String job) {
		this.job = job;
	}
	
	void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}


	public int getHp() {
		return hp;
	}


	public int getAttack() {
		return attack;
	}


	public int getDefense() {
		return defense;
	}

	public int getMoney() {
		return money;
	}

	public String getJob() {
		return job;
	}

	public Random getRand() {
		return rand;
	}
	
	
}