package ch09;

public class SaleUse2 {
	public static void main(String[] args) {
		Sale2 s=new Sale2();
		s.input("aa001", "TV", "삼성", 201781228, 2000, 5);
		s.calc();
		s.print();
	}
}
