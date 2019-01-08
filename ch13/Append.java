package ch13;

public class Append {
	public static void main(String[] args) {
		String a= "hello";//불변 immutable a=100
		a= a+"java";//a=200
		System.out.println(a);
		
		StringBuilder b= new StringBuilder("hello");
		b.append("java");
		System.out.println(b);
		//StringBuilder은 주소 값을 변경 시키지 않고 내용을 변경 시키는 기능이 있음.
		//StringBuilder은 자주 쓰이는 클래스들이야.
		Integer.parseInt("10", 100);
		int acg=10;
		
		
	}
}
