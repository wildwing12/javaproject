package ch13;

public class Tostr {
	public static void main(String[] args) {
		Object obj= new Object();
		obj= new Integer(20);//다형성(왼:부, 우:자)
		
		obj=40;//참조변수에는 원래 주소값이 들어가지만 jdk1.5버전 이후 부터는 
		//value가 들어갈 수 있도록 내부처리를 한다.(intvalue()등의 호출)하도록
		//했다. (Auto boxing처리)
		System.out.println(obj);//Auto unboxing
		obj=new Double(20.5);
		obj=30.5;
		System.out.println(obj);
		obj="hello";
		System.out.println(obj);

		
		
	}
}
