public class Exp21_3 {
	public static void main(String[] args) {

		Student student1 = new Student("ハルト", 72);
		Student student2 = new Student("ミナト", 88);
		Student student3 = new Student("アカリ", 95);

		student1.showInfo();
		student2.showInfo();
		student3.showInfo();

		Student.showAverage();
	}

}




class Acount{
	String ownerName = "空き";
	
	static void showDate() {
//		System.out.println(ownerName);
	}
}