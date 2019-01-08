package ch04;

import java.util.Scanner;

public class Cost2 {
	public static void main(String[] args) {
		String name = "";
		int price = 0;
		int point = 0;
		int point_use = 0;
		int fee = 0;
		int pay;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		name = scan.next();
		System.out.print("가격 : ");
		price = scan.nextInt();
		System.out.println("포인트 : ");
		point = scan.nextInt();
		scan.close();
		
		if(price<50000) {
			fee = 2500;
		}else {
			fee = 0;
		}
		if(point>30000) {
			point_use = point;
			pay = price+fee-point;
		}else {
			pay = price+fee;
		}
		
		System.out.println("이름\t구매금액\t포인트\t배송료\t포인트사용\t결재금액");
		System.out.println(name+"\t"+price+"\t"+point+"\t"+fee+"\t"+point_use+
				"\t"+pay);
		
	}

}
