public class Exp21_1 {
	public static void main(String[] args) {

		Student student1 = new Student("ハルト");
		Student student2 = new Student("ミナト");
		
		System.out.println("学科名：" + Student.department);
		student1.showName();
		student2.showName();
		System.out.println("登録学生数：" + Student.studentCount + "人");
	}
}