package ch16;

public class Syn2 {
	public static void main(String[] args) {
		Atm2 atm2=new Atm2();
		
		Thread kim=new Thread(atm2, "kim");
		Thread lee=new Thread(atm2, "lee");
		Thread park=new Thread(atm2, "park");
		Thread king=new Thread(atm2, "king");
		
		kim.start();
		lee.start();
		park.start();
		king.start();
		
		
	}
}
