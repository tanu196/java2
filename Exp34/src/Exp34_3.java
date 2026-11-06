public class Exp34_3 {
	public static void main(String[] args) {
		GameCharacter[] party = {
				new GameCharacter(),
				new Wizard(),
				new Ninja()
		};
		
		//for文バージョン
		for(int i = 0 ; i < party.length ; i++) {
			party[i].specialMove();
		}
		//for拡張バージョン
		for(GameCharacter g  : party) {
			g.specialMove();
		}
		
	}
}