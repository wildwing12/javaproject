package ch16;

public class ThreadB extends Thread{
	
	int total;
	@Override
	public void run() {
		synchronized(this) {
			for(int i=0; i<5; i++) {
				System.out.println(i+"를 더합니다.");
				total+=i;//total=total+1
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			notify();//wait하고 있는 쓰레드를 깨움
			
		}
	}
	
}
