package ch12;

public class StaticInner2 {
	static String name="홍길동";
	static int age=30;
	static class Inner{
		public void print() {
			System.out.println("이름 : "+name);
			System.out.println("나이 : "+age);
		}
	}
	public static void main(String[] args) {
		StaticInner2.Inner n=new StaticInner2.Inner();
		n.print();
	}
}
