package ch10;

public class StaticMethod {
	static int a=10;
	int b=20;
	
	public static void printA() {
		System.out.println(a);
		StaticMethod s= new StaticMethod();
		System.out.println(s.b);
	}
	public void pintB() {
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		printA();
//		pintB();//main밖에 있는 non static이기 때문에
		StaticMethod a= new StaticMethod();
		a.pintB();
	}
}
	