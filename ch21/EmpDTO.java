package ch21;

import java.sql.Date;
//Dto:data transfer Object
public class EmpDTO {

	private int empno;
	private String ename; 
	private Date hiredate;
	private int sal;
	protected int getEmpno() {
		return empno;
	}
	protected void setEmpno(int empno) {
		this.empno = empno;
	}
	protected String getEname() {
		return ename;
	}
	protected void setEname(String ename) {
		this.ename = ename;
	}
	protected Date getHiredate() {
		return hiredate;
	}
	protected void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	protected int getSal() {
		return sal;
	}
	protected void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "EmpDTO [empno=" + empno + ", ename=" + ename + ", hiredate=" + hiredate + ", sal=" + sal + "]";
	}
	public EmpDTO(int empno, String ename, Date hiredate, int sal) {
		this.empno = empno;
		this.ename = ename;
		this.hiredate = hiredate;
		this.sal = sal;
	}
	public EmpDTO() {
		
	} 
	
	
}
