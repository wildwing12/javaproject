package ch16;

public class MyThreadEx extends Thread{
	String s;
	public MyThreadEx(String s) {
		this.s=s;
	}
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.print(s);
			
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
