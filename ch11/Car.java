package ch11;

public class Car implements Vehicle {

	@Override
	public void speedUP() {
		System.out.println("Car speedUP");

	}

	@Override
	public void speedDown() {
		System.out.println("Car SpeedDown");

	}

	@Override
	public void handle() {
		System.out.println("Car handling");

	}

}
