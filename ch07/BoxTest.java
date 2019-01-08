package ch07;

public class BoxTest {
	public static void main(String[] args) {
		Box b;
		b = new Box();
		//System.out.println(b);// box의 메모리 출력값 확인하는 방ㅂ
		b.width=20;
		b.length=20;
		b.height=30;
		
		System.out.println("상자의 가로, 세로, 높이는  " + b.width+","+b.length+","+b.height+"입니다.");
	}
	
}
