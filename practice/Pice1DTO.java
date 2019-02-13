package practice;

import java.io.Serializable;

public class Pice1DTO implements Serializable{
	private String name;
	private String hp;
	private int age;
	private PiceDTO pice;
	public Pice1DTO() {
	}
	public Pice1DTO(String name, String hp, int age, String jumin, String pwd) {
		super();
		this.name = name;
		this.hp = hp;
		this.age = age;
		pice=new PiceDTO(jumin, pwd);
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getHp() {
		return hp;
	}
	protected void setHp(String hp) {
		this.hp = hp;
	}
	protected int getAge() {
		return age;
	}
	protected void setAge(int age) {
		this.age = age;
	}
	protected PiceDTO getPice() {
		return pice;
	}
	protected void setPice(PiceDTO pice) {
		this.pice = pice;
	}
	@Override
	public String toString() {
		return "Pice1DTO [name=" + name + ", hp=" + hp + ", age=" + age + ", pice=" + pice + "]";
	}
	
	
}
