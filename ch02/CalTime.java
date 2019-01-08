package ch02;
//지구에서 달까지 거리 계산하기
public class CalTime {

	public static void main(String[] args) {
		final double LIGHT_SPEED = 30e4;//빛의 속도=300,000km/sec
		double distance = 40e12; //달까지 거리 약 40x10의 12승km
		double secs;
		
		secs = distance/LIGHT_SPEED;
		
		double light_year = secs/(60.0*60.*24.0*365.0);//secs/(초
		System.out.println("걸리는 시간은 "+ LIGHT_SPEED + "광년입니다.");
		

	}

}
