package pot;

import java.util.Scanner;

public class ProjectJavaBasic {
	private int amount;
	private int price;
	private int total;
	private double mileage;
	Scanner scan = new Scanner(System.in);

	public void amo() {
		while(true) {
			System.out.println("구매할 상품의 갯수를 입력하시오.(단, 5개 미만)");
			amount = scan.nextInt();
			if(amount<=5) {
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하여 주십시오");
				continue;
			}
		}
		
	}
	public void input() {
		for (int i = 1; i <= amount; i++) {
			System.out.println("상품 가격을 입력하십시오");
			price = scan.nextInt();
			total += price;

		}
		mileage = total * 0.01;

	}

	public void Print() {
		System.out.println("===================================");
		System.out.println("총구입 가격은 : " + total + "(원)입니다.");
		System.out.println("마일리지는 : " + mileage + "(원)입니다.");
		System.out.println("===================================");

	}

	public static void main(String[] args) {
		ProjectJavaBasic p = new ProjectJavaBasic();
		p.amo();
		p.input();
		p.Print();
		p.scan.close();
	}
}
