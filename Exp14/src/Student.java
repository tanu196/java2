public class Student {

	private String name;
	private String number;
	private int score;

	public Student() {
	}

	public Student(String name, String number, int score) {
		this.name = name;
		this.number = number;
		this.score = score;
	}

	void showProfile() {
		System.out.println("名前；" + this.name);
		System.out.println("学籍番号；" + this.number);
		System.out.println("成績；" + this.score + "点");
	}

}