package ch08;

public class Book2 {
	private String name;
	private String bookName;
	private String press;
	private int price;
	private int amount;
	private int money;
	private String grade;
	
	public Book2() {
		this("홍길동","Java","한빛",20000,3);
	}
	public Book2(String name, String bookName, String press, int price, int amount) {
		this.name = name;
		this.bookName = bookName;
		this.press=press;
		this.price=price;
		this.amount=amount;
		money=price*amount;
		
		if(money>100000) {
			grade ="gold";
		}else {
			grade="silver";
		}
			
		
	}
	public void print() {
		System.out.println("이름\t도서명\t출판사\t가격\t수량\t금액\t등급");
		System.out.println(name+"\t"+bookName+"\t"+press+"\t"+price+"\t"+amount+"\t"+money+"\t"+grade);
	}
	
}
