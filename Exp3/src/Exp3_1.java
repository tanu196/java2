public class Exp3_1 {
	public static void main(String[] args) {
		
		String word = new String("apple");
		
		String empty = new String("");
		
		System.out.println(word.isEmpty());
		System.out.println(empty.isEmpty());
		
		
		System.out.println(word.contains("a"));
		
		System.out.println(empty.contains(""));
		
		System.out.println(word.substring(2,5));
	}
}
