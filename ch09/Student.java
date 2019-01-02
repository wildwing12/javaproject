package ch09;

public class Student {
	protected String name;//이름
	protected String num;//학번
	protected  String major;//전공
	protected  int year;//학년
	
	public Student() {		
	}
	
	public void input(String name,String num,String major,int year) {
		this.name=name;
		this.num =num;
		this.major=major;
		this.year=year;
				
		
	}
	
}
