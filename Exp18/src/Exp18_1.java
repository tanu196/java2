public class Exp18_1 {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.balance = 10000;
		
		
		System.out.println("現在の預金残高：" + account.balance + "円");
		account.balance = 203030;
		System.out.println("変更後の預金残高：" + account.balance + "円");
		
	}
}