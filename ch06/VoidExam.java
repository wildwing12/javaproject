package ch06;
//리턴 값이 없을때
public class VoidExam {
	//리턴 타입  메소드 이름();
	static void hello() {
		System.out.println("안녕하세요");
		return; // 리턴 값이 없이 종료, 생략 가능but 쓰는 게 좋아
			}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		hello();
		System.out.println("프로그램 종료");
	}
}
