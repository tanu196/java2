public class BattleRobot extends Robot{
	private String weapon;
	private int battery;
	public BattleRobot(int battery) {
		super(battery);
		this.weapon = "レーザー砲";
		System.out.println("武器を準備しました");
	}
	
	public void showStatus() {
		System.out.println("バッテリー残量：" + getBattery() + " 武器：" + weapon);
	}
}