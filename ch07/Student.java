package ch07;

public class Student {
	private String name;
	private String major;
	private int year;
	private int num;
	private double score;
	private String tuition;
	private String scholarship;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getTuition() {
		return tuition;
	}
	public void setTuition(String tuition) {
		this.tuition = tuition;
	}
	public String getScholarship() {
		if(score>=4.3) {
			scholarship="전액";
		}else if(score>=4.0) {
			scholarship="250만원";
			
		}else if(score>=3.5) {
			scholarship="100만원";
		}else {
			scholarship="0원";
		}
		return scholarship;
	}
	public void setScholarship(String scholarship) {
		this.scholarship = scholarship;
	}
	
	public void print() {
		System.out.println("이름\t전공\t학년\t학번\t평균평점\t등록금\t장학금");
		System.out.println(name+"\t"+major+"\t"+year+"\t"+num+"\t"+score+"\t"+tuition+"\t"+getScholarship());
	}
}
