
package ch07;

public class StudentUse {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setName("아무개");
		stu.setMajor("컴퓨터");
		stu.setYear(3);
		stu.setNum(1234);
		stu.setScore(3.0);
		stu.setTuition("400만원");
		
		stu.print();
		
		
	}
	
	
}
