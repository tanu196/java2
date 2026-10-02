import java.util.Scanner;

public class Exp7_2 {
	public static void main(String[] args) {
		Hero hero1 = new Hero();
		Scanner sc = new Scanner(System.in);
		System.out.println("行動を選択してください");
		System.out.print("１：攻撃　");
		System.out.print("２：防御　");
		System.out.print("３：道具を使う");
		int command = sc.nextInt();
		hero1.selectAction(command);
		
		
	}
}