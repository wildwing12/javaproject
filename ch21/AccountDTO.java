package ch21;

public class AccountDTO {
	private String bank; 
	private String num;
	private String name;
	private int money;
	protected String getBank() {
		return bank;
	}
	protected void setBank(String bank) {
		this.bank = bank;
	}
	protected String getNum() {
		return num;
	}
	protected void setNum(String num) {
		this.num = num;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected int getMoney() {
		return money;
	}
	protected void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "AccountDTO [bank=" + bank + ", num=" + num + ", name=" + name + ", money=" + money + "]";
	}
	public AccountDTO(String bank, String num, String name, int money) {
		this.bank = bank;
		this.num = num;
		this.name = name;
		this.money = money;
	}
	public AccountDTO() {
	} 
	
	
}
