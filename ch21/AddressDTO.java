package ch21;

public class AddressDTO {
	private String email; 
	private String name; 
	private String addr; 
	private String hp;
	protected String getEmail() {
		return email;
	}
	protected void setEmail(String email) {
		this.email = email;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getAddr() {
		return addr;
	}
	protected void setAddr(String addr) {
		this.addr = addr;
	}
	protected String getHp() {
		return hp;
	}
	protected void setHp(String hp) {
		this.hp = hp;
	}
	@Override
	public String toString() {
		return "AddressDTO [email=" + email + ", name=" + name + ", addr=" + addr + ", hp=" + hp + "]";
	}
	public AddressDTO(String email, String name, String addr, String hp) {
		this.email = email;
		this.name = name;
		this.addr = addr;
		this.hp = hp;
	}
	public AddressDTO() {
	} 
	
	
}
