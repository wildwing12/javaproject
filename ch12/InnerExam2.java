package ch12;

public class InnerExam2 {
	static class Cal{
		int vlaue =0;
		public void plus() {
			vlaue++;
		}
	}//end inner class
	public static void main(String[] args) {
		//static  inner class인 경우
		//outer class.inner class 변수 =new 
		InnerExam2.Cal cal=new InnerExam2.Cal();
		cal.plus();
		System.out.println(cal.vlaue);
	}
}
