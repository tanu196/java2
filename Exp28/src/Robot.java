public class Robot {
	private int battery;
//	public Robot() {
//		battery = 100;
//		System.out.println("バッテリーを準備しました");
//	}
//	
	
	public Robot(int battery) {
		this.battery = battery;
		System.out.println("バッテリーを準備しました。");
	}
	
	public int getBattery() {
		return battery;
	}
}