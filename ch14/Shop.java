package ch14;

import java.util.Scanner;

public class Shop {
	private String name;
	private String company;
	private int price;
	private int amount;
	private int money;
	
	public Shop() {}
	public Shop(String name, String company, int price, int amount, int money) {
		this.name = name;
		this.company = company;
		this.price = price;
		this.amount = amount;
		this.money = money;
		
		money=amount*price;
	}
	
	public void input() {
		Scanner scan=new Scanner(System.in);
		System.out.println();
		System.out.println("제품 : ");
		name=scan.next();
		System.out.println("제조사 : ");
		company=scan.next();
		System.out.println("단가 : ");
		price=scan.nextInt();
		System.out.println("수량 : ");
		amount=scan.nextInt();
		money=price*amount;
		
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getCompany() {
		return company;
	}
	protected void setCompany(String company) {
		this.company = company;
	}
	protected int getPrice() {
		return price;
	}
	protected void setPrice(int price) {
		this.price = price;
	}
	protected int getAmount() {
		return amount;
	}
	protected void setAmount(int amount) {
		this.amount = amount;
	}
	protected int getMoney() {
		return money;
	}
	protected void setMoney(int money) {
		this.money = money;
	}
	
	
}
