package ch16;

public class ThreadExam2 {
	public static void main(String[] args) {
		MyThread2 r1 = new MyThread2("*");
		MyThread2 r2 = new MyThread2("-");
		//MyThread2는 직접 Thread를 상속받지 않았기 때문에 Thread가 아니다.
		//따라서 Thread를 별도로 생성하고, 해당 생성자에 MyThread2를 넣어서
		//Thread를 생성한다.
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		
		t1.start();//Thread의 run()호출
		t2.start();
		System.out.print("main !!!!");
	}
}
