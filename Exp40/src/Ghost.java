public class Ghost extends Monster{
	private int magic;
	
	public Ghost(String name , int magic) {
		super(name);
		this.magic = magic;
	}
	
	@Override
	public int calculateDamage() {
		return magic * 3;
	}
	
	
}