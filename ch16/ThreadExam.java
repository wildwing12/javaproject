package ch16;
//멀티스레드 : 작업단위가 2개 이상
//멀트스레드를 구현하는 방법
//1. Thread를 상속
//2. Runnable을 구현
public class ThreadExam extends Thread{
	public ThreadExam(String name) {
		super(name);//부모클래스(Thread)의 생성자 호출, 쓰레드의 title설정
	}
	
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);//cpu의 실행을 1초간 멈춤
			} catch (InterruptedException e) {
				e.printStackTrace();//에러 메시지를 화면에 출력
			}
		}//end for
	}//end run()
	
	public static void main(String[] args) {
		ThreadExam e1=new ThreadExam("thread1");
		ThreadExam e2=new ThreadExam("thread2");
		ThreadExam e3=new ThreadExam("thread3");
		
		e1.start();//스레드객체.start() ==> run()이 호출됨
		e2.start();//위와 동시에 호출
		e3.start();//위와 동시에 호출, 즉 여기선 3개가 동시에 run()호출
		//run()을 호출하면 메인 스레드가 실행되기 때문에 주의해야 한다.
	}

}
