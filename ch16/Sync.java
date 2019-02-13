package ch16;

public class Sync {
	public static void main(String[] args) {
		Atm atm= new Atm();
		
		Thread mom=new Thread(atm, "mom");
		Thread son=new Thread(atm, "son");
		mom.start();
		son.start();
	}
}
