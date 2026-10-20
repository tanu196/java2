public class Hero {
	private String name;
	private int attackPower;
	private Weapon weapon;
	
	public Hero(String name , int attackPower , Weapon weapon) {
		this.name = name;
		this.attackPower = attackPower;
		this.weapon = weapon;
	}
	
	
	
	void showWeapon() {
		System.out.println("武器名：" + this.weapon.getName());
		System.out.println("武器の攻撃力：" + this.weapon.getAttackPower());
	}
	
	void attack() {
		int damage = attackPower + weapon.getAttackPower();
		System.out.println(name + "は" + this.weapon.getName() + "です");
		System.out.println(damage + "ダメージを与えた！");
	}
	
	
	
	
	
}