package ch07;

public class piontUse {
	public static void main(String[] args) {
		Point p1 = new Point();//Point 클래스 객체(인스턴스 )생성
		p1.setName("김철수");
		p1.setKor(90);
		p1.setEng(80);
		p1.setMat(89);
		p1.print();
	}
}
