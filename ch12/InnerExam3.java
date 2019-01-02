package ch12;

public class InnerExam3 {
	public void exec() {
		class Cal{
			int vlaue=0;
			public void plus() {
				vlaue++;
			}//inner method
		}//end inner class
	Cal cal= new Cal();
	cal.plus();
	System.out.println(cal.vlaue);
	}//end method
	public static void main(String[] args) {
		InnerExam3 t= new InnerExam3();
		t.exec();
	}
}
