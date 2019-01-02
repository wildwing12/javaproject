package ch12;

public class TestMemberOuter2 {
	private String name="홍길동";
	private int age=30;
	class Inner{
		public void input() {
			System.out.println("이름 : "+name);
			System.out.println("나이 : "+age);
			
		}
		
	}
	public static void main(String[] args) {
		TestMemberOuter2 t=new TestMemberOuter2();
		TestMemberOuter2.Inner tt=t.new Inner();
		tt.input();
	}
}
