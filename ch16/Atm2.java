package ch16;

public class Atm2 extends Thread {
	private long depositMoney = 400000;

	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			withDraw(10000);
		}
	}
	public synchronized void withDraw(int money) {
		String name=Thread.currentThread().getName();
		if(depositMoney>0) {
			depositMoney-=money;
			System.out.println(name+"-잔액 : "+depositMoney);
		}else {
			System.out.println(name+"-잔액이 없습니다.");
		}
	}
}
