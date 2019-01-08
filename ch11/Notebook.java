package ch11;

public class Notebook implements Controllable {

	@Override
	public void turnOn() {
		System.out.println("Notebook을 켠다");

	}

	@Override
	public void TurnOff() {
		System.out.println("Notebook을 끈다");

	}

}
