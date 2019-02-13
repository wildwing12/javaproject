package practice;

import java.io.Serializable;

public class PiceDTO implements Serializable {
	private String jumin;
	private String passwd;
	public PiceDTO(String jumin, String passwd) {
		super();
		this.jumin = jumin;
		this.passwd = passwd;
	}
	public PiceDTO() {
		
	}
	protected String getJumin() {
		return jumin;
	}
	protected void setJumin(String jumin) {
		this.jumin = jumin;
	}
	protected String getPasswd() {
		return passwd;
	}
	protected void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	@Override
	public String toString() {
		return "PiceDTO [jumin=" + jumin + ", passwd=" + passwd + "]";
	}
	
	
}
