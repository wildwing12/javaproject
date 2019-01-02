package ch09;
//상속하는 목적은 코드의 재사용
//class자식 클래스 extends 부모 클레스
public class Sholar extends Student {//장학생은 학생이다.
	//부모객체인 student의  name, num, major, year를 중복해 사용하지 않고 
	//상속하여 사용한다. 
	private String category;
	private int money;
	//오버라이딩(추가 가능)
	public void input(String name,String num,String major,int year, String category, int moeny) {
		super.input(name, num, major, year);
		this.category=category;
		this.money=money;
		
				
	}
	public void print() {
		System.out.println("이름\t학번\t\t전공\t학년\t구분\t장학금액");
		System.out.println(name+"\t"+num+"\t"+major+"\t"+year+"\t"+category+"\t"+money);
	}
	public void print2() {
		System.out.println("이름\t학번\t\t전공\t학년");
		System.out.println(name+"\t"+num+"\t"+major+"\t"+year);
	}
}
