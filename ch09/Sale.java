package ch09;

public class Sale extends Product{
	private int amount;
	private int money;
	
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney() {
		money= amount*getPrice();
	}
	public void print() {
		System.out.println("코드\t품명\t제조사\t제조일자\t\t단가\t수량\t금액(단위:천원)");
		System.out.println(getCord()+"\t"+getName()+"\t"+getCompany()+"\t"+getYear()+"\t"+getPrice()
		+"\t"+amount+"\t"+money);
		
		
	}
	
}
