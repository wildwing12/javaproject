package ch07;

public class AuctionUse {
	public static void main(String[] args) {
		Auction au= new Auction();
		au.setName("김철수");
		au.setId("kims");
		au.setMoney(150000);
		au.getGrade();
		au.print();
	}
	

}

