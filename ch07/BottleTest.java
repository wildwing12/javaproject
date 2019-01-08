package ch07;

public class BottleTest {
	public static void main(String[] args) {
		Bottle bot;
		bot = new Bottle();
		
		bot.t=1000;
		bot.u=500;
		
		System.out.println("물병의 용량은"+bot.t+"ml인데 지금 남은 용량은"+bot.u+"ml입니다.");
	}

}
