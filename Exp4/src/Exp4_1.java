public class Exp4_1 {
	public static void main(String[] args) {
		Student student1 = new Student();
		
		System.out.println("名前：" + student1.name);
		System.out.println("点数：" + student1.score);
		System.out.println("出席回数：" + student1.attendance);
		
	}
}


class Student{
	String name;
	int score;
	int attendance;
	
	public Student() {
		this.name = "いしまる";
		this.score = 123;
		this.attendance = 1234556;
	}
	
	
	
	
}