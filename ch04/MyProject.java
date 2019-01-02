package ch04;

import java.util.Scanner;

public class MyProject {

	public static void main(String[] args) {
		int menu=0;
		int num=0;
		int ns = 3000;
		int ss = 5000;
		int rs = 4000;
		int hs = 4000;
	    int price =0;
		
		Scanner scanner = new Scanner(System.in);
		
			while(true) {
				System.out.println("원하는 메뉴를 선택하세요");
				System.out.println("(1)그냥샌드위치 :"+ns+"원");
				System.out.println("(2)스페셜샌드위치 :"+ss+"원");
				System.out.println("(3)밥샌드위치"+rs+"원");
				System.out.println("(4)Hellfire샌드위치"+hs+"원");
				String tmp = scanner.next();
				menu = Integer.parseInt(tmp);
				if (menu == 1) {
					price = ns;
					System.out.println("주문 감사합니다. 잠시 기다려주세요");
					break;
				}else if (menu == 2) {
					price = ss;
					System.out.println("주문 감사합니다. 잠시 기다려주세요");
					break;
				}else if (menu == 3) {
					price = rs;
					System.out.println("주문 감사합니다. 잠시 기다려주세요");
					break;
				}else if (menu == 4) {
					price = hs;
					System.out.println("주문 감사합니다. 잠시 기다려주세요");
					break;		
				}else if(!(1<=menu&&menu<=4)) {
					System.out.println("잘못 선택하셨습니다. 다시 선택하세요");
					continue;
				}
				
				
				}
				System.out.println("선택하신 메뉴는 "+menu+"이고 가격은"+price+"입니다");
				scanner.close();							
		}
		
				

	}


