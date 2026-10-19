public class Exp21_2 {
	public static void main(String[] args) {
		Student student1 = new Student("ハルト");
		Student student2 = new Student("ミナト");
		
		student1.showName();
		student2.showName();
		Student.studentCount++;
	
		Student.showStudentCount();
		
		
		
	}
}
