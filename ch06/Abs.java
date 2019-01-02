package ch06;

public class Abs {
	static int abs(int num) {
		return num > 0 ? num : -num;//3항 연산자 f?:t:f => +15
		
		
		
	}
	public static void main(String[] args) {
		int  a=-15;
		System.out.println(a);
		System.out.println(abs(a));//call by value(깊은 복사)
		System.out.println(Math.abs(a));		
	}

}
