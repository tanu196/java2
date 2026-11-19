final public class FinalMonster extends Monster{
	private int attack;
	
	public FinalMonster(String name , int attack) {
		super(name);
		this.attack = attack;
	}
	
	public int calculateDamage() {
		return attack * 3;
	}
}
