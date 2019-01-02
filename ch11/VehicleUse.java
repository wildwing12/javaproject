package ch11;

public class VehicleUse {
	public static void main(String[] args) {
		Car c= new Car();
		c.speedUP();
		c.speedDown();
		c.handle();
		System.out.println();
		Vehicle v=new Plane();
		v.speedUP();
		v.speedDown();
		v.handle();
		System.out.println();
		v=new Boat();
		v.speedUP();
		v.speedDown();
		v.handle();
	}
}
