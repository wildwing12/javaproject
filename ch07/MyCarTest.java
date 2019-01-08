package ch07;

class Mycar{
	String model;
	String velue;
	void print() {
		System.out.println(velue+"짜리 "+model);
	}
}


public class MyCarTest {
	public static void main(String[] args) {
		Mycar myho= new Mycar();
		myho.model="그랜져";
		myho.velue = "4000만원";
		myho.print();
		
		Mycar yourho= new Mycar();
		yourho.model="벤츠";
		yourho.velue="1억";
		yourho.print();
	}
}
