
public class Slime extends Monster{
	private String species;
	
	public Slime() {
		super(24);
		this.species = "スライム";
	}
	
	public Slime(String species , int hp) {
		super(hp);
		this.species = species;
	}
	
	
	public void showProlfile() {
		System.out.println("種族名：" + species + "HP：" + getHp());
	}
	
	
	
}