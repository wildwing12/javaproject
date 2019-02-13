package ch16;
//main도 쓰레드
public class ThreadA {
	public static void main(String[] args) {//main Thread
		ThreadB b= new ThreadB();//TreadB =>Thread
		b.start();
		
		synchronized (b) {//main 쓰레드 진행`	
			try {
				System.out.println("b가 완료될때까지 기다립니다.");
				b.wait();
				        
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}		
			System.out.println("Total is: "+b.total);
		}//end synchronized
	}//end main
}
