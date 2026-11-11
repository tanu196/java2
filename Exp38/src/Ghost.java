public class Ghost extends Monster{
	private int magic;
	
	public Ghost(int magic) {
		this.magic = magic;
	}
	
	@Override
	public int calculateDamage() {
		return magic *3;
	}
}
