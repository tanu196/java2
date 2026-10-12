public class Exp15_2 {
	public static void main(String[] args) {
		Product product1 = new Product();
		Product product2 = new Product("紅茶" , 450);
		Product product3 = new Product("コーヒー豆" , 1200 , 30);
		Product product4 = new Product("ジュース" , 180 , 50 , "飲料");
		
		product1.showInfo();
		System.out.println();
		product2.showInfo();
		System.out.println();
		product3.showInfo();
		System.out.println();
		product4.showInfo();
		System.out.println();
	}
}