package ch11;

public class MyCalculatorExam {
	public static void main(String[] args) {
		Calculator cal = new Mycalculator();
		int vlaue1 = cal.multiple(5, 10);
		int vlaue2 = cal.plus(5, 10);
		int vlaue3 = cal.exec(5, 10);
		
		System.out.println(vlaue1);
		System.out.println(vlaue2);
		System.out.println(vlaue3);
	}	

}
