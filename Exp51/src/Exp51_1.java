public class Exp51_1 {
	public static void main(String[] args) {
		
		int num = 10;
		System.out.println("num:" + num);
		
		Integer obj = new Integer(10);
		System.out.println("obj:" + obj);
		
		
		
		Integer objNum = new Integer(num);
		System.out.println("objNum:" + objNum);

		
		
		Integer nmnu = Integer.valueOf(15);
		int obj2 = obj.intValue();
		
		
		Integer i = 30;
		Double objDouble = Double.valueOf(i.intValue());
		
	}
}