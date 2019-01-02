package ch12;

public class TestMemberOuter1 {
	private int data  =30;
	class Inner {//내부클래스(외부 클래스의 멤버를 자유롭게 사용함. private한것일지라도)
		
		void msg() {
			System.out.println("data is "+ data);
		}
		
	}//end inner class
	public static void main(String[] args) {
		TestMemberOuter1 obj= new TestMemberOuter1();
		TestMemberOuter1.Inner in= obj.new Inner();
		in.msg();
	}

}
