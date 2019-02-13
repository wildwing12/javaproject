package ch19;

import java.io.Serializable;

public class MemberDTO implements Serializable{
	private String name;
	private int age;
	private MemberInfoDTO memberInfo;
	private String hp;
	
	public MemberDTO() {
	}
	
	public MemberDTO(String name, int age, String hp, String jumin, String pwd) {
		super();
		this.name = name;
		this.age = age;
		this.hp=hp;
		memberInfo = new MemberInfoDTO(jumin,pwd);
	}
	//getter,setter
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
	protected MemberInfoDTO getMemberInfo() {
		return memberInfo;
	}
	protected void setMemberInfo(MemberInfoDTO memberInfo) {
		this.memberInfo = memberInfo;
	}
	protected String getHp() {
		return hp;
	}
	
	protected void setHp(String hp) {
		this.hp = hp;
	}
	

	@Override
	public String toString() {
		return "MemberDTO [name=" + name + ", age=" + age +", hp=" + hp + ", memberInfo=" + memberInfo +  "]";
	}


	
}
