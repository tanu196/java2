public class Exp1_1 {
	public static void main(String[] args) {
		int score = 75;
		
		if(score >= 60) {
			System.out.println("合格です");
		}else {
			System.out.println("不合格です");
		}
		
		score = 55;
		
		if(score >= 60) {
			System.out.println("合格です");
		}else if(score >= 50) {
			System.out.println("補欠合格です");
		}else {
			System.out.println("不合格です");
		}
	}
}
