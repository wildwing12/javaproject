package ch08;

public class MemberUse2 {
	public static void main(String[] args) {	
		Member2 m=new Member2();
		m.input("김철수", 1234, 84, 72, 99);
		m.cul();
		m.print();
		
		Member2 m2=new Member2("박철수",4321,100,80,87);
		m2.cul();
		m2.print();
		
		
	}
}
