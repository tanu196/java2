public class Exp20_4 {
	public static void main(String[] args) {
		Student student1 = new Student("ハルト", 85);
		Student student2 = new Student("ミナト", 92);

		student1.showInfo();
		student2.showInfo();

		Student.department = "超！環境情報";

		student1.showInfo();
		student2.showInfo();
	}
}
