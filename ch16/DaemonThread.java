package ch16;

/*
 * 데몬 쓰레드
 * 데몬(Daemon)이란 보통 리눅스와 같은 유닉스 계열의 운영체제에서
 * 백그라운드 동작하는 프로그램을 말한다.
 * 데몬스레드를 만드는 방법은 스레드에 데몬 설정을 하면 된다.
 * 윈도우에서는 데몬을 서비스라고함.
 * 예)에디터를 실행할때 일정 시간 동안 자동 저장하거나 마춤법검사를 하는 기능
 * 데몬 스레드는 일반 스레드가 모두 종료가 되면 강제 적으로 종료되는 특징이 있다. 
 */
public class DaemonThread implements Runnable{
	//무한루프안에서 0.5초씩 쉬면서 데몬 쓰레드가 실행중입다. 출력
	@Override
	
	public void run() {
		while(true) {
			System.out.println("데몬 쓰레드가 실행중입니다.");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break; //Exeptoin발생시 while문 빠져나가도록
			}
		}
		
	}//end run()
	public static void main(String[] args) {
		Thread th=new Thread(new DaemonThread());
		//데몬스레드 설정
		th.setDaemon(true);
		th.start();//데몬쓰레드 실행
		
		//메인 쓰레드가 1초뒤에 종료되도록 설정
		//데몬쓰레드는 다른 쓰레드가 모두 종료되면 자동 종료
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("메인 쓰레드가 종료됩니다.");
	}
	
}
