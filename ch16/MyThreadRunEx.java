package ch16;

public class MyThreadRunEx implements Runnable {
	String str;
	public MyThreadRunEx(String str) {
		this.str=str;
	}
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.print(str);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		
	}
		
		
	}

}
