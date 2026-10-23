public class Exp26_1 {
	public static void main(String[] args) {
		Warrior warrior = new Warrior();
		Mage mage = new Mage();
		
		warrior.name = "アーサー";
		warrior.hp = 120;
		
		mage.hp = 80;
		mage.name = "メル";		
		warrior.showStatus();
		mage.showStatus();
		
		
		Warrior.partyGold += 500;
		
		Warrior.showGold();
		
		Mage.showGold();
		
	}
}