package ch12;

public class StaticInner {
	static int x=10;
	static class Inner{
		int getx(){
			return x;
			
		}
	}
	public static void main(String[] args) {
		StaticInner.Inner in= new StaticInner.Inner();
		System.out.println(in.getx());
	}
}
