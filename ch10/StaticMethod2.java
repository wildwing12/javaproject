
package ch10;

public class StaticMethod2 {
	static String a="static method 호출";
	String b="non-static method 호출";
	
	public static void printA() {
		System.out.println(a);
		System.out.println("저는 static멤버에요\n안녕?\n");		
	}
	public void printB() {
		System.out.println(b);
		System.out.println("저는 non-static 멤버에요\nhi?");
	}
	public static void main(String[] args) {
		printA();
		StaticMethod2 s=new StaticMethod2();
		s.printB();
	}
}
