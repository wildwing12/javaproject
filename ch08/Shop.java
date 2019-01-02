package ch08;

public class Shop {
	private String name;
	private String pd;
	private String brand;
	private int price;
	private int amount;
	private int money;
	private String grade;
	
	public Shop() {
		
	}
	
	public Shop(String name, String pd, String brand, int price,int amount) {
		this.name=name;
		this.pd=pd;
		this.brand=brand;
		this.price=price;
		this.amount=amount;
		
		
		money=price*amount;
		
		if(money>500) {
			grade="gold";
			
		}else {
			grade="silver";
		}
			
	}
	public void print() {
		System.out.println("고객명\t상품명\t제조사\t가격\t수량\t금액\t고객등급");
		System.out.println(name+"\t"+pd+"\t"+brand+"\t"+price+"\t"+amount+"\t"+money+"\t"+grade);
	}
}
