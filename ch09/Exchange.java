package ch09;

public class Exchange {
	public static void main(String[] args) {
		Kor kor= new Kor();
		Jap jap=new Jap();
		
		System.out.println("달러에 대한 환율 : "+kor.getExchange());
		System.out.println("엔화에 대한 환율 : "+jap.getExchange());
	}
	
}
