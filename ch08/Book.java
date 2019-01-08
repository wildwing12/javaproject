package ch08;

public class Book {//도서판매 정보
	private String bookName;
	private String author;
	private String press;
	private int year;
	private int price;
	private int amount;
	private int money;//단가 *판매수량
	
	public Book() {
		//this()를 활용해서 아래 매개변수가 6개인 생성자를 호출 하면서 값들을 초기화 시켜주는 것
		this("자바","김철수","한빛",2016,20000,10);
		System.out.println("기본 생성자가 호출...");
		
	}
	public Book(String bookName, String author, String press, int year, int price, int amount) {
		System.out.println("매개변수가 있는 생성자 호출...");
		this.bookName = bookName;
		this.author = author;
		this.press = press;
		this.year = year;
		this.price = price;
		this.amount = amount;
		money = price*amount;
	}//end book(...);
//	public void  input(String bookName, String author, String press, int year, int price, int amount) {
//		this.bookName = bookName;
//		this.author = author;
//		this.press = press;
//		this.year = year;
//		this.price = price;
//		this.amount = amount;
//		money = price*amount;
//	}
	public void print() {
		System.out.println("도서명\t저자\t출판사\t출판연도\t가격\t판매수량\t판매금액");
		System.out.println(bookName+"\t"+author+"\t"+press+"\t"+year+"\t"+price+"\t"+amount+"\t"+money);
	}
	
	

}
