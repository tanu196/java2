public class Exp1_2 {
	public static void main(String[] args) {
		int menuNumber = 2;

		switch (menuNumber) {
		case 1:
			System.out.println("""
					商品名：生姜焼き定食
					料金：８５０円
					""");
			break;

		case 2:
			System.out.println("""
					商品名：唐揚げ定食
					料金：７８０円
					""");
			break;

		case 3:
			System.out.println("""
					商品名：カレーライス
					料金：７００円
					""");
			break;

		default:
			System.out.println("該当する商品はありません");
			break;
		}

	}
}