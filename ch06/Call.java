package ch06;

public class Call {
	static void test(int b) {//b=10
		System.out.println("test method 호출");
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		System.out.println("시작");
		int a=10;
		test(a);//call by value
		System.out.println("끝");
	}
}
