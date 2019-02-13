package ch16;

public class Atm extends Thread {
	private long depositMoney=100000;
	
	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			withDraw(10000);
		}
	}//end run()

	public synchronized void withDraw(int money) {
		String name=Thread.currentThread().getName();
		if(depositMoney>0) {
			depositMoney = depositMoney-money;
			System.out.println(name+"-잔액:"+depositMoney);
			
		}else {
			System.out.println(name+"-잔액이 없습니다.");
		}
			
		
	}
	
}
