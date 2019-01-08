package ch12;

public class InnerClass {
	private static int x =10;
	
	class Inner{
		int getx(){
			return x;
		}
	}// end inner class
	public static void main(String[] args) {
		System.out.println(x);
		InnerClass e= new InnerClass();//우선 outer 객체 생성
		InnerClass.Inner in= e.new Inner();//inner객체 생성
		
		System.out.println(in.getx());
	}
}
