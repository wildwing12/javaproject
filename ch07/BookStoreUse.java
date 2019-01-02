package ch07;

public class BookStoreUse {
	public static void main(String[] args) {
		Bookstore bs = new Bookstore();
		bs.setBookname("Java");
		bs.setAuthor("김선생");
		bs.setPress("영진");
		bs.setYear(2108);
		bs.setAmount(10);
		bs.setPrice(30000);
		bs.print();
		
	}
}
