package practice;

public class NameDTO {
	private int num;
	private String name; 
	private int age; 
	private int sal;
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
	protected int getAge() {
		return age;
	}
	protected void setAge(int age) {
		this.age = age;
	}
	protected int getSal() {
		return sal;
	}
	protected void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "NameDTO [num=" + num + ", name=" + name + ", age=" + age + ", sal=" + sal + "]";
	}
	public NameDTO(int num, String name, int age, int sal) {
		this.num = num;
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	public NameDTO() {
	
	}
	
	
}
