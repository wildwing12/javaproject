package ch09;

public class Product {
	private int cord;
	private String name;
	private String company;
	private String year;
	private int price;
	
	public int getCord() {
		return cord;
	}
	public void setCord(int cord) {
		this.cord = cord;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}


//코드	 품명	 	제조사	 제조일자 	단간 		수량		 금액(단위:천원)
//1		냉장고	lg		제조일자	1000	10			10000