package ch10;

public class Test {
	static int a;//static member
	int b;//non-staic member
	void print() {
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		System.out.println(a);
		
		Test t=new Test();
		System.out.println(t.b);
		t=null;//t참조변수의 값을 null로 초기화(주소값을 잃음)
	//	System.out.println(t.b);
		System.out.println(Math.PI);
		final int NUM=5000;//NUM을 상수처리
		
	}
	
}
