abstract class Monster {
	private String name;

	Monster(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showName() {
		System.out.println("モンスター名：" + this.name);
	}

	public abstract int calculateDamage();
}