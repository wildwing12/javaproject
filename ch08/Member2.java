package ch08;

public class Member2 {
	private String name;
	private int num;
	private int java;
	private int jsp;
	private int html;
	private int total;
	private double avg;
	private String grade;
	
	public Member2() {
		this("김철수",1234,90,80,95);
		System.out.println("기본 생성자 호출...");
	}
	public Member2(String name, int num, int java, int jsp, int html) {
		System.out.println("매개 변수가 있는 생성자 호출...");
		this.name = name;
		this.num=num;
		this.java=java;
		this.jsp=jsp;
		this.html=html;
	}
	public void input(String name, int num, int java, int jsp, int html) {
		this.name = name;
		this.num=num;
		this.java=java;
		this.jsp=jsp;
		this.html=html;
	}
	public void cul() {
		total=java+jsp+html;
		avg=total/3.0;
		
		if(avg>=90) {
			grade="A";
		}else if(avg>=80) {
			grade="B";
			
		}else if(avg>=70) {
			grade="C";
		}else if(avg>=60) {
			grade="D";
		}else
			grade="F";
	}
	public void print() {
		System.out.println("이름\t학번\tJava\tJSP\tHTMl\t총점\t평균\t등급");
		System.out.println(name+"\t"+num+"\t"+java+"\t"+jsp+"\t"+html+"\t"+total+"\t"
		+String.format("%.1f", avg)+"\t"+grade);
	}
	
}
