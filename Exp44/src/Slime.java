final class Slime extends Monster{
	private int attack;
	
	Slime(String name , int attack){
		super(name);
		this.attack = attack;
	}
	
	@Override
	public int calculateDamage() {
		return attack;
	}
}
