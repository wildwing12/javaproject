package ch16;

public class ThreadRunUseEx {
	public static void main(String[] args) {
		System.out.print("\"메인 쓰레드...\", ");
		
		MyThreadRunEx m1=new MyThreadRunEx("\"쓰레드one\", ");
		MyThreadRunEx m2=new MyThreadRunEx("\"쓰레드two\", ");
		MyThreadRunEx m3=new MyThreadRunEx("\"쓰레드three\", ");
		
		Thread t1=new Thread(m1);
		Thread t2=new Thread(m2);
		Thread t3=new Thread(m3);
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}
	
}
