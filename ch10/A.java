package ch10;
//static=>메모리에 자동 로딩

public class A {
	String name ="kim";
	static int n = 20;//static member=>메모리에 자동 로딩 스페셜한 공간이고 용량이 작은 공간이라 그냥 막 쓰지는 않아요.
	public void print() {
		System.out.println(name);
		System.out.println(n);
	}
	public static void main(String[] args) {
		int a=10;
		double b=20.5;
		System.out.println(a);
		System.out.println(b);
//		System.out.println(name);
		System.out.println(n);
		A aa=new A();//객체를 생성한 후에나  non-static member를 사용할 수 있음.
		System.out.println(aa.name);
		aa.print();
	}
}
