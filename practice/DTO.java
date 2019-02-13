package practice;

import java.io.Serializable;

public class DTO implements Serializable{
	private String juNo;
	private String passwd;
	public DTO(String juNo, String passwd) {
		super();
		this.juNo = juNo;
		this.passwd = passwd;
	}
	public DTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected String getJuNo() {
		return juNo;
	}
	protected void setJuNo(String juNo) {
		this.juNo = juNo;
	}
	protected String getPasswd() {
		return passwd;
	}
	protected void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	@Override
	public String toString() {
		return "DTO [juNo=" + juNo + ", passwd=" + passwd + "]";
	}
	
}
