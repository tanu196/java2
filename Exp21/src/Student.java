public class Student {
	String name;
	static String department = "環境情報";
	static int studentCount = 0;	
	
	
	
	
	
	Student(String name){
		this.name = name;
		Student.studentCount++;
	}
	
	void showName() {
		System.out.println("学生名：" + this.name);
	}
	
}