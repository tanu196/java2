package Java2_Type;
public class lesson2 {
	public static void main(String[] args) {
		 int[] s = {10, 20, 30 }; 
		 int[] t = s; 
		 s[0] = 15;
		 System.out.print("s: "); 
		 for( int num : s ) { 
		 System.out.print(num + " "); 
		 } 

		 System.out.println(); 

		 System.out.print("t: "); 
		 for( int num : t ) { 
		 System.out.print(num + " "); 
		 }
		
		 String a = null;
		 System.out.println(a.length());
		 
	}
}