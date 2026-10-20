public class Exp22_1 {
	public static void main(String[] args) {
		Weapon weapon = new Weapon("はがねのつるぎ" , 18);
		Hero hero = new Hero("マサル" , 12 , weapon);
		hero.showWeapon();
		hero.attack();
		
		
		
	}
}