package ch09;

public class Manager2 extends Employee2{
	private String rnn;
	private int bonus;
	
	public Manager2() {}
	public Manager2(int num, String name, String add, String email, int salary, String rnn, int bonus) {
		super(num,name,add,email,salary);
		this.rnn=rnn;
		this.bonus=bonus;
		
	}
	public void print() {
		System.out.println("사원번호 : "+num);
		System.out.println("이름 : "+name);
		System.out.println("주소 : "+add);
		System.out.println("이메일 주소 : "+email);
		System.out.println("연봉 : "+getSalary());
		System.out.println("주민등록 번호 : "+rnn);
		System.out.println("보너스 : "+bonus);
		
	}
}
