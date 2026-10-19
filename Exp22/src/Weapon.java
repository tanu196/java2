public class Weapon {
	private String name;
	private int attackPower;
	
	public Weapon(String name , int attackPower) {
		this.name = name;
		this.attackPower = attackPower;
	}
	public Weapon() {};
	
	String getName(String name) {
		return name;
	}
	
	int getAttackPower(int attackPower) {
		return attackPower;
	}
	
	
}