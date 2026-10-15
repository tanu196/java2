public class Exp18_1 {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.setBalance(10000);

		System.out.println("現在の預金残高：" + account.getBalance() + "円");
		account.setBalance(203030);
		System.out.println("変更後の預金残高：" + account.getBalance() + "円");
	}
}