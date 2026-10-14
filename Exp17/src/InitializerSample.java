class Sample {
	int number;
	
	{
		number = 18;
		System.out.println("初期化子");
	}
	
	Sample(){
		System.out.println("コンストラクタ");
	}
	
	
	
}


class InitializerSample{
	public static void main(String[] args) {
		Sample sample = new Sample();
		System.out.println(sample.number);
	}
}