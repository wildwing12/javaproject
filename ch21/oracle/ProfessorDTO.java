package ch21.oracle;

public class ProfessorDTO {
	private int profno;
	private String name;
	protected int getProfno() {
		return profno;
	}
	protected void setProfno(int profno) {
		this.profno = profno;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "ProfessorDTO [profno=" + profno + ", name=" + name + "]";
	}
	public ProfessorDTO(int profno, String name) {
		
		this.profno = profno;
		this.name = name;
	}
	public ProfessorDTO() {
	
	}
	
}
