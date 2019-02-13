package ch19;

import java.io.Serializable;
//객체 직렬화 : Serializable
//메모리에 저장된 객체를 파일로 저장하거나 네트워크로 전송할 때 사용
//DTO : Data Transfer Object ( 데이터를 전달하는 개체, 결과물 저장)
//DAO : Data Access Object(데이터를 조작 객체, 데이터를 구하는 비지니스로직)
//비지니스 로직: (data =>전송 (파일, Database(sql...))
//VO : Vector Object, Value Object
//객체 직렬화 를 하려면 Serializable, 인터페이스를 구현해야 함.

public class MemberInfoDTO implements Serializable{
	private String juminNO;
	private String passwd;
	//gatter, setter
	protected String getJuminNO() {
		return juminNO;
	}
	protected void setJuminNO(String juminNO) {
		this.juminNO = juminNO;
	}
	protected String getPasswd() {
		return passwd;
	}
	protected void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	@Override
	public String toString() {
		return "MemberInfoDTO [juminNO=" + juminNO + ", passwd=" + passwd + "]";
	}
	public MemberInfoDTO(String juminNO, String passwd) {
		super();
		this.juminNO = juminNO;
		this.passwd = passwd;
	}
	public MemberInfoDTO() {
		super();
		
	}
	
	
}
