public class Student {
	String name;
	int score;
	static String department = "環境情報";
	static int studentCount = 0;	
	static int totalScore = 0;
	
	Student(String name , int score){
		this.name = name;
		this.score = score;
		Student.studentCount++;
		Student.totalScore += score;
	}
	
	
	Student(String name){
		this.name = name;
		Student.studentCount++;
	}
	
	void showName() {
		System.out.println("学生名：" + this.name);
	}
	public static void showStudentCount() {
		System.out.println("登録学生数：" + studentCount + "人");
	}
	
	void showInfo() {
		System.out.println("学生名：" + this.name + "、得点：" + this.score + "点");
	}
	
	
	static void showAverage() {
		int average = Student.totalScore / Student.studentCount;
		System.out.println("全体の平均点：" + average + "点");
	}
}