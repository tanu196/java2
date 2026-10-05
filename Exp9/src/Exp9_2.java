import java.util.Scanner;

public class Exp9_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		RamenShop shop = new RamenShop();
		shop.showWelcome();
		shop.reserveSeats(sc.next(), sc.nextInt());
		shop.showMenu();
		System.out.print("メニュー番号を入力してください：");
		int number = sc.nextInt();
		System.out.print("個数を入力してください：");
		int count = sc.nextInt();
		shop.orderRamen(number, count);
		shop.showTotal();
		System.out.println("支払金額を入力してください");
		int money = sc.nextInt();
		int reminder =  shop.checkout(money);
		System.out.println("おつり：" + reminder + "円");
	}
}
