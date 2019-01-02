package ch09;

public class Volume extends Area{
	private int height; //30
	
	public Volume( ) { } //기본생성자 (default constructor)
	
	//매개변수가 있는 생성자
	public Volume(int width, int length, int height) {
		super(width, length);
		//부모클래스의 매개변수가 있는 생성자 호출=> Area(int w, int l)
		this.height = height;
		//super() => 부모클래스의 생성자 호출
		//super. => 부모클래스의 변수, method 호출
		//this() => 현재 클래스의 생성자 호출
		//this. => 현재 클래스의 변수, method 호출
	}
	
	public int getVolume() {
		//getArea()는 부모클래스의 method
		return getArea()*height;//200*30
	}
}
