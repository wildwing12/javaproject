package ch03;

public class Shift {
	public static void main(String[] args) {
		int a= 2;
		//a의 값을 좌측으로 2비씩 쉬프트(밀어내기)
		int b = a << 2;
		System.out.println(b);
		
		b = b >> 2;
		System.out.println(b);
	}

}
