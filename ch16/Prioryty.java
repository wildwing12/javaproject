package ch16;

public class Prioryty extends Thread {
	public static void main(String[] args) {
		Prioryty e1= new Prioryty();
		Prioryty e2= new Prioryty();
		
		e1.setName("thread1");
		e2.setName("thread2");
		System.out.println("e1의 기본 우선순위 : "+e1.getPriority());
		System.out.println("e2의 기본 우선순위 : "+e2.getPriority());
		//쓰레드의 우선 순위 설정(1~10)
		//우선 순위를 설정 한다 해서 반드시 적용되는 것은 아님
		//Thread.MAX_PRIORITY 최대 우선순위를 (10)
		//Thread.NORM_PRIORITY 최대 우선순위를 (5)
		//Thread.MIN_PRIORITY 최대 우선순위를 (1)
		
		e1.setPriority(Thread.MIN_PRIORITY);//최소 우선순위(1)
		e2.setPriority(MAX_PRIORITY);//최대 우선순위 (10)
		e1.start();
		e2.start();
		
		
	}
	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println(Thread.currentThread().getName()+"==>"+i);
		}
			
	}
}
