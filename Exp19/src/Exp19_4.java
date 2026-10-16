public class Exp19_4 {
	public static void main(String[] args) {
		Product product = new Product(101, "ライブ Tシャツ", 3500);

		product.setPrice(3800);
		System.out.println("現在の価格：" + product.getPrice() + "円");

		product.setPrice(-500);
		System.out.println("現在の価格："
				+ product.getPrice() + "円");
	}
}
