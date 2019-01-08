package ch10;

public class OverloadExam {
	//오버로딩
	public void putData(String a) {
		System.out.println(a);
		
	}
	public void putData(int a) {
		System.out.println(a);
	}
	public void putData(double a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		OverloadExam o= new OverloadExam();
		o.putData(100);
		o.putData("Hello");
		o.putData(100.5);
	}
	//non static맴버들은 new 해서 사용;
}
