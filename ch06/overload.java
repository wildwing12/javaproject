package ch06;

//매소드 이름 은 같음. 그러나 데이터 타입이나 파라미터가 다르다.
//주의점 :
//1)메소드의 이름이 같아야 한다. 
//2)파라미터의(매개 변수)의 갯수가 달라야 한다.
//3)데이터 타입이 달라야 한다. 
class overload {//클래스 이름  extends Object가 생략되어 있음
	//같은 기능을 하는게 많으면 메소드를 하나의 이름으로 만들어 처리(오버로딩)
	//하는게 효율적(유지보수 편리)
	//Object obj =10;
	//object =new integer(10);
	//obj =100.5;
	//obj = new Double(100.5);
	//obj = new String("java");
			
	public static void main(String[] args) {
		print(10);
		print(100.5);
		print("java");
	}

	private static void print(String string) {
		System.out.println(string);
	
	
}

	private static void print(double d) {
	
	System.out.println(d);
}

	private static void print(int i) {
	System.out.println(i);	
	}
}
