package ch21.oracle;

public class DepartmentDTO {
	private int deptno;
	private String dname;
	protected int getDeptno() {
		return deptno;
	}
	protected void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	protected String getDname() {
		return dname;
	}
	protected void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "DepartmentDTO [deptno=" + deptno + ", dname=" + dname + "]";
	}
	public DepartmentDTO(int deptno, String dname) {
		this.deptno = deptno;
		this.dname = dname;
	}
	public DepartmentDTO() {
	}
	
}
