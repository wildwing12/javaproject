package ch09;

public class SholarUse {
	public static void main(String[] args) {
		Sholar s1=new Sholar();
	
		s1.input("김철수", "20171130", "컴공", 1, "1종", 2500000);;
		s1.print();
		System.out.println("=========================================================");
		//input메소드 호출시 파라미터 갯수에 맞추어 해당 객체에 없으면
		//상속받은 상위 객체에서 찾는다.
		s1.input("홍길동", "20180101", "전자", 3);
		s1.print2();
	}
}
