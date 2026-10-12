//キャラクターの情報を持つだけのクラス
class Character {
	private String name;
	private int money;
	private String job;
	private int hp;
	private int attack;
	private int defense;

	public Character() {

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
	
	
}