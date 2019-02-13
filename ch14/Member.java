package ch14;

public class Member {
	private String userid;
	private String passwd;
	private String name;
	private String tel;
	private String email;
	
	protected String getUserid() {
		return userid;
	}
	protected void setUserid(String userid) {
		this.userid = userid;
	}
	protected String getPasswd() {
		return passwd;
	}
	protected void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getTel() {
		return tel;
	}
	protected void setTel(String tel) {
		this.tel = tel;
	}
	protected String getEmail() {
		return email;
	}
	protected void setEmail(String email) {
		this.email = email;
	}
	public Member() {}
	public Member(String name, String userid, String passwd,  String tel, String email) {
		super();
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.tel = tel;
		this.email = email;
	}
	
}
