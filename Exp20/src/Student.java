public class Student {
	String name;
	int score;
	static String department = "環境情報";
	static int studentCount = 0;

	Student(String name, int score) {
		this.name = name;
		this.score = score;
		Student.studentCount++;
	}

	void showInfo() {
		System.out.println(Student.department + "学科の"
				+ this.name + "さん：" + this.score + "点");
	}
}
