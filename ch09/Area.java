package ch09;

public class Area {
	//맴버변수
	private int width;//private은 상속금지, 전역변수는 int0 초기화 ,
	private int length;
	
	//새성자
	public Area() {}//기본 생성자도 만들어 놓아야 한다.
	public Area(int width, int length){//매개변수 2개의 생성자
		this.width=width;
		this.length=length;
		
	}
	public int getArea() {//메소드
		return width*length;//리턴값은 int 타입
	}
}
