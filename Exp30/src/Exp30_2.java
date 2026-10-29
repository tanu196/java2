public class Exp30_2 {
	public static void main(String[] args) {
		GameCharacter gameCharacter = new GameCharacter();
		Wizard wizard = new Wizard();
		Ninja ninja = new Ninja();
		
		gameCharacter.attack();
		wizard.attack();
		ninja.attack();
		
		gameCharacter.specialMove();
		wizard.specialMove();
		ninja.specialMove();
		
		
		
	}
}