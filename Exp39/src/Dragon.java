public class Dragon extends Monster{
	private int attack;
	
	Dragon(int attack){
		this.attack = attack;
	}
	
	public int calculateDamage() {
		return attack * 2;
	}
}