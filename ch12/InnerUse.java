package ch12;

import ch11.Flyer;

public class InnerUse {
	public static void main(String[] args) {
		Flyer f= new Flyer() {//new 자료형()();=>무명클래스

			@Override
			public void takeoff() {
				System.out.println("take off");
				
			}

			@Override
			public void fly() {
				System.out.println("fly");
				
			}

			@Override
			public void land() {
				System.out.println("land");
				
			}
		};//무명클레스
		//new 자료형 (){ }; = 무명 클레스
		f.takeoff();
		f.fly();
		f.land();
		}

}
