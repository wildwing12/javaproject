package ch11;

public class Tv implements Controllable {

	@Override
	public void turnOn() {
		System.out.println("TV를 켠다");

	}

	@Override
	public void TurnOff() {
		System.out.println("Tv를 끈다");

	}

}
