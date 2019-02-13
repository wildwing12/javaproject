package ch16;

public class JoinExam {
	public static void main(String[] args) {
		MyThread5 thread=new MyThread5();
		//Thread 시작
		thread.start();
		System.out.println("Thread가 종료될때까지 기다립니다.");
		try {
			thread.join();//해당스레드가 종료될때까지 기다림
		} catch (InterruptedException e) {
			
			
			e.printStackTrace();
		}
		
		System.out.println("Thread가 종료되었습니다.");
	}
}
