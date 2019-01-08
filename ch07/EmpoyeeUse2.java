package ch07;

public class EmpoyeeUse2 {
	public static void main(String[] args) {
		Employee2 e2 = new Employee2();
		e2.setName("김철수");
		e2.setPart("관리부");
		e2.setPosition("과장");
		e2.setBasic(300);
		e2.getBonus();
		e2.getTotal();
		e2.getTax();
		e2.getSalary();
		e2.print();
		
	}
}
