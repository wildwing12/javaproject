package ch16;

public class ThreadExam1 {
	public static void main(String[] args) {
		MyThread1 t1=new MyThread1("*");
		MyThread1 t2=new MyThread1("-");
		//쓰레드를 생성하고, Thread 클내스가 가지고 있는 start()메소드 호출
		//main쓰레드를 포함해서 모두 3개의 쓰레드가 실행되는것임
		t1.start();
		t2.start();
		
		System.out.println("main end !!!");//모든 스레드가 종료되어야
		//프로그램이 종료된다.
	}
}
