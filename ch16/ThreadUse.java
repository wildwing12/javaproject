package ch16;

public class ThreadUse {
	public static void main(String[] args) {
		MyThreadEx m1=new MyThreadEx("\"쓰레드one\", ");
		MyThreadEx m2=new MyThreadEx("\"쓰레드two\", ");
		MyThreadEx m3=new MyThreadEx("\"쓰레드three\", ");
		
		m1.start();
		m2.start();
		m3.start();
		
		System.out.print("\"메인 쓰레드...\", ");
		
	}
	
	
}
