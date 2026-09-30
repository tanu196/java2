class Player {
	String name = "勇者";
	int hp = 100;



	void takeDamage() {
		hp -= 10;
	}
	
	void heal() {
		hp += 20;
	}
	
	
	void showStatus() {
		System.out.println("名前：" + name);
		System.out.println("HP：" + hp);
	}
	
	
}