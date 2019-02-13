package practice;

import java.io.Serializable;

public class MemDTO implements Serializable{
	private String name;
	private int age;
	private DTO dto;
	
	public MemDTO(String name, int age, String ju, String pwd) {
		super();
		this.name = name;
		this.age = age;
		dto= new DTO(ju, pwd);
	}
	public MemDTO() {
		super();
		// TODO Auto-generated constructor stub
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
	protected DTO getDto() {
		return dto;
	}
	protected void setDto(DTO dto) {
		this.dto = dto;
	}
	@Override
	public String toString() {
		return "MemDTO [name=" + name + ", age=" + age + ", dto=" + dto + "]";
	}
	
	 
}
