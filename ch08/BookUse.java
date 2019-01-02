package ch08;

public class BookUse {
	public static void main(String[] args) {
		Book b =new Book("Java","김선생","영진",2017,30000,10);
		
		b.print();
		
		Book b2= new Book();//객체 생성 및 기본 생성자 호출
		b2.print();
		
	}
}
