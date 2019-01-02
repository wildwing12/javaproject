package ch12;

public class InnerExam1 {
	class Cal{
		int value =0;
		public void plus() {
			value++;
		}//end method
	}//end inner class
	
	public static void main(String[] args) {
		InnerExam1 t = new InnerExam1();// outer class  객체 생성
		//내부 클래스 객체 생성시 바깥쪽 클래스 . 내부 클래스 변수 =new 내부 클래스();
		InnerExam1.Cal cal= t.new Cal();// inner class 객체 생성
		cal.plus();
		System.out.println(cal.value);
	}
}
