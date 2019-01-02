package ch11;

public class AutoCarTest {
	public static void main(String[] args) {
		OperateCar Obj = new Autocar();
		Obj.start();
		Obj.setSpeed(30);
		Obj.turn(15);
		Obj.stop();
	}
}
