class Dragon extends Monster {
	private int attack;

	Dragon(String name, int attack) {
		super(name);
		this.attack = attack;
	}

	@Override
	public String calculateDamage() {
		return "ダメージ:" + this.attack * 2;
				
	}
}