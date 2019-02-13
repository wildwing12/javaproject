package ch16;

public class ThreadJoin extends Thread {
	//join: join메소드를 호출한 스ㄷ레드가 종료될때까지 현재의 쓰레드를
	//대기 시킴
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"스레드가 시작되었습니다.");
		ThreadJoin e=new ThreadJoin();
		e.setName("thread1");
		e.start();
		
		try {
			e.join();//새로운 작업을 요청하면 기다렸다가 다시 실행.싱글 스레드처럼
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"쓰레드가 종료되었습니다.");
	}

	@Override
	public void run() {
		//현재 실행중인 스레드의 이름
		System.out.println(Thread.currentThread().getName()+"스레드가 시작되었습니다.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"스레드가 종료되었습니다.");
	}
}
