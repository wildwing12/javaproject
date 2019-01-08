package ch09;

public class SaleUse {
	public static void main(String[] args) {
		Sale s1=new Sale();
		s1.setCord(1);
		s1.setName("냉장고");
		s1.setCompany("LG");
		s1.setYear("2018-01-01");
		s1.setPrice(1000);
		s1.setAmount(10);
		s1.setMoney();
		s1.print();
	}
}
