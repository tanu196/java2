import java.util.ArrayList;
import java.util.Arrays;
public class Exp52_1 {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("はやて");
		list.add("しょへ");
		list.add("はくお");
		list.add("しょき");
		list.add("じゅん");
		list.add("にいの");
		System.out.println(list);
		
		ArrayList<String> recipe = new ArrayList<>(Arrays.asList("suger" , "butter" , "fresh" , "cream"));
		
		System.out.println(recipe);
		recipe.add(2 , "カヌー");
		recipe.remove(3);
		recipe.remove("カヌー");
		recipe.set(2, null);
		System.out.println(recipe);
	}
}