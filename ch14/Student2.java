package ch14;

public class Student2 {
	private int num;
	private String name;
	private String major;
	private int year;
	private String professor;
	protected int getNum() {
		return num;
	}
	protected void setNum(int num) {
		this.num = num;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getMajor() {
		return major;
	}
	protected void setMajor(String major) {
		this.major = major;
	}
	protected int getYear() {
		return year;
	}
	protected void setYear(int year) {
		this.year = year;
	}
	protected String getProfessor() {
		return professor;
	}
	protected void setProfessor(String professor) {
		this.professor = professor;
	}
	public Student2(int num, String name, String major, int year, String professor) {
		super();
		this.num = num;
		this.name = name;
		this.major = major;
		this.year = year;
		this.professor = professor;
	}
	public Student2() {
		
	}
	
	

}
