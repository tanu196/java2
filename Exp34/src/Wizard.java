class Wizard extends GameCharacter {
	@Override
	public void specialMove() {
		System.out.println("魔法攻撃！えいっ！！");
		System.out.println("5,000 ダメージを与えた");
		System.out.println("MP を5 消費した");
	}
}