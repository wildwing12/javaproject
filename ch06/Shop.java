package ch06;

public class Shop {
	static String[] name = {"홍길동","이길동","이몽룡","이순신","장연실"};
	static String[] product = {"TV","드라이기","컴퓨터","다리미","고급샤프"};
	static String[] adr = {"서울", "경기", "인천","강원","호남"}; 
	static int[] hp = {72548878,14241111,12457787,11415547,12475544};
	static int[] price = {1000000,40000,1200000,300000,50000};
	static int fee;
	static int[] totalPrice = new int[5];
	
	static void fee() {
		for(int i=0; i<name.length; i++) {
			if(price[i]<10000) {
				fee=2500;
			}else {
				fee=0;
			}
				
		}
	}
	static void total() {
		for(int i=0; i<name.length; i++) {
			totalPrice[i] = price[i]+fee;
		}
	}
	static void print() {
		System.out.println("이름\t주소\thp\t\t상품명\t가격\t배송료\t총구입금액");
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]+"\t"+adr[i]+"\t"+hp[i]+"\t"+product[i]+"\t"+price[i]+"\t"+fee+"\t"+totalPrice[i]);
		}
	}
	public static void main(String[] args) {
		total();
		fee();
		print();
	}
}
