public abstract class Monster {
	private String name;
	
	public void showName(String name) {
		showName();
	}
	
	public abstract int calculateDamage();
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void showName() {
		System.out.println(name);
	}
	
	
}