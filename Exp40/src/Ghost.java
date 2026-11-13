public class Ghost extends Monster{
	private int magic;
	
	public Ghost(String name , int magic) {
		super(name);
		this.magic = magic;
	}
	
	@Override
	public String calculateDamage() {
		return "ダメージ:" + this.magic * 3;
	}
	
	
}