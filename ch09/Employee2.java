package ch09;

public class Employee2 {
	public int num;
	public String name;
	protected String add;
	String email;
	private int salary;
	
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee2() {}
	public Employee2(int num, String name, String add, String email,int salary) {
		this.num=num;
		this.name=name;
		this.add=add;
		this.email=email;
		this.salary=salary;
	}
	
	
	
}
