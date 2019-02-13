package ch16;

//MusicBox에는 3개의 메소드가 존재(신나는음악, 슬픈음악, 카페음악)
//Player 3명이 하나의 MusicBox를 사용.. 이때 어떤 일이 발생하는지 살펴봄..
public class MusicBox {//공유객체
	//신나는 음악!!! 이란 메시지가 1초이하로 쉬면서 10번 반복출력
	
	//메소드 앞에 synchronized를 붙이면 해당메소드는 객체의 사용권
	//(Monitoring Lock)을 얻는다. 즉, 해당메소드가 모두 수행한 후에 다른
	//메소드가 수행된다.
	public synchronized void playMusicA() {
		for(int i=0; i<10; i++) {
			System.out.println("신나는 음악!!!");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//end for
	}//end playMusicA()
	
	public synchronized void playMusicB() {
		for(int i=0; i<10; i++) {
			System.out.println("슬픈 음악!!!");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}//end playMusicB()
	
	public void playMusicC() {
		
		synchronized (this) {
			//synchronize를 메소드에 붙혀서 사요할 경우 메소드의 코드가
			//길어지면, 마지막에 대기하는 쓰레드가 너무 오래 기다리는 것을
			//막기 위해서 메소드에  synchronized를 붙이지 않고
			//문제가 있을 것 같은 부분만 
			//synchronized블록을 사용한다.
			System.out.println("카페 음악!!!");
		}
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}//end playMusicC()
}
