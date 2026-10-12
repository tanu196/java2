class Member {
	private String name;
	private int point;
	
	public Member() {
		this.name = "未登録";
		this.point = 0;
	}
	
	public Member(String name) {
		this.name = name;
		this.point = 0;
	}
	
	public Member(String name , int point) {
		this.name = name;
		this.point = point;
	}
	
	
	void showInfo() {
		System.out.println(this.name + ":" + this.point + "ポイント");
	}
	
}
