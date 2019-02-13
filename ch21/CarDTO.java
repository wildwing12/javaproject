package ch21;

//dto :Data Transfer Object  데이터 저장, 전달하는 객체
//하나의 레코드를 저장
//VO :value Object 값을 저장하는 객체
//car 테이블의 1개의 레코드를 저장
public class CarDTO {
	private String license_number;
	private String company; 
	private String type;
	private int year;
	private int efficiency;
	
	protected String getLicense_number() {
		return license_number;
	}
	protected void setLicense_number(String license_number) {
		this.license_number = license_number;
	}
	protected String getCompany() {
		return company;
	}
	protected void setCompany(String company) {
		this.company = company;
	}
	protected String getType() {
		return type;
	}
	protected void setType(String type) {
		this.type = type;
	}
	protected int getYear() {
		return year;
	}
	protected void setYear(int year) {
		this.year = year;
	}
	protected int getEfficiency() {
		return efficiency;
	}
	protected void setEfficiency(int efficiency) {
		this.efficiency = efficiency;
	}
	
	
	@Override
	public String toString() {
		return "CarDTO [license_number=" + license_number + ", company=" + company + ", type=" + type + ", year=" + year
				+ ", efficiency=" + efficiency + "]";
	}
	public CarDTO(String license_number, String company, String type, int year, int efficiency) {
		this.license_number = license_number;
		this.company = company;
		this.type = type;
		this.year = year;
		this.efficiency = efficiency;
	}
	public CarDTO() {
		
	}
}
