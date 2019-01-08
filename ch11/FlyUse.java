package ch11;

public class FlyUse {
	public static void main(String[] args) {
		Bird bird =new Bird();
		bird.takeoff();
		bird.fly();
		bird.land();
		
		Airplane air=new Airplane();
		air.takeoff();
		air.fly();
		air.land();
		
		Flyer f= new Bird();
		//f는 bird객체의 주소값
		f.takeoff();
		f.fly();
		f.land();
		
		f= new Airplane();
		//f는 Airplane의 주소값을 가지고 있다.
		f.takeoff();
		f.fly();
		f.land();
		
	}
}
