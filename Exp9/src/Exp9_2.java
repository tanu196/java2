import java.util.Scanner;

public class Exp9_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RamenShop shop = new RamenShop();
//		shop.reserveSeats("すする", 2);

//		shop.orderRamen(1, 2);
//		shop.orderRamen(3, 1);
//		shop.showTotal();
		
		shop.showWelcome();
		shop.reserveSeats(sc.next(), sc.nextInt());
		shop.showMenu();
		System.out.print("メニュー番号を入力してくださ：");
		int number = sc.nextInt();
		System.out.print("個数を入力してください：");
		int count = sc.nextInt();
		shop.orderRamen(number, count);
	}
}
