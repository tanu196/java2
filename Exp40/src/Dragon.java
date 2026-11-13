class Dragon extends Monster {
	private int attack;

	Dragon(String name, int attack) {
		super(name);
		this.attack = attack;
	}

	@Override
	public int calculateDamage() {
		return this.attack * 2;
	}
}