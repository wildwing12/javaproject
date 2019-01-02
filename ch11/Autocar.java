package ch11;

public class Autocar implements OperateCar {

	@Override
	public void start() {
		System.out.println("자동차 출발합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("자동차가 정지합니다.");
		
	}

	@Override
	public void setSpeed(int speed) {
	 System.out.println("자동차가 속도를"+speed+"km/h로 바꿉니다.");
		
	}

	@Override
	public void turn(int degree) {
		System.out.println("자동파가 방향을"+degree+"도 만큼 바꿉니다.");
		
	}
	

}
