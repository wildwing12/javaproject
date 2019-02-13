package ch21;

public class ScoreDTO {
	private String student_no; 
	private String name; 
	private int kor; 
	private int eng; 
	private int mat; 
	private int tot;
	private double avg;
	protected String getStudent_no() {
		return student_no;
	}
	protected void setStudent_no(String student_no) {
		this.student_no = student_no;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected int getKor() {
		return kor;
	}
	protected void setKor(int kor) {
		this.kor = kor;
	}
	protected int getEng() {
		return eng;
	}
	protected void setEng(int eng) {
		this.eng = eng;
	}
	protected int getMat() {
		return mat;
	}
	protected void setMat(int mat) {
		this.mat = mat;
	}
	protected int getTot() {
		return tot;
	}
	protected void setTot(int tot) {
		this.tot = tot;
	}
	protected double getAvg() {
		return avg;
	}
	protected void setAvg(double avg) {
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "ScoreDTO [student_no=" + student_no + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat="
				+ mat + ", tot=" + tot + ", avg=" + avg + "]";
	}
	public ScoreDTO() {
	}
	public ScoreDTO(String student_no, String name, int kor, int eng, int mat) {
		this.student_no = student_no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		//총점, 평균 계산
		tot = kor+eng+mat;
		avg = tot/3.0;
	}
	
	
	
	
}
