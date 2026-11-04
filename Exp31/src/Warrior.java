public class Warrior extends GameCharacter{
	private static final  int a = 10;
	private final static int b = 10;
	static private final int c = 10;
	static final private int d = 10;
	final private static int e = 100;
	final static private int f = 1000;
	public Warrior(String name , int hp) {
		super(name , hp);
	}
	
	public void specialMove() {
		System.out.println("斧で攻撃します！");
	}
	
//	public void showStatus() {
//		System.out.println("職業：戦士");
//	}
//	
	
}
