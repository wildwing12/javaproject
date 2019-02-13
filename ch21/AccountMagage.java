package ch21;

import java.util.List;
import java.util.Scanner;

import practice.DTO;

public class AccountMagage {
	AccountDAO dao=new AccountDAO();
	void list() {
		List<AccountDTO> items =dao.listAccount();
		System.out.println("--------------------------------------------------------");
		System.out.println("은행\t계좌번호\t\t예금주\t잔액");
		System.out.println("========================================================");
		for(AccountDTO dto:items) {
			System.out.print(dto.getBank()+"\t");
			System.out.print(dto.getNum()+"\t");
			System.out.print(dto.getName()+"\t");
			System.out.println(dto.getMoney()+"\t");
		}
		System.out.println("---------------------------------------------------------");
	}//end list
	void insert() {
		Scanner scan= new Scanner(System.in);
		System.out.println("은행:");
		String bank=scan.nextLine();
		System.out.println("계좌번호:");
		String num=scan.nextLine();
		System.out.println("예금주 : ");
		String name=scan.nextLine();
		System.out.println("잔액 : ");
		int money=scan.nextInt();
		AccountDTO dto=new AccountDTO(bank, num, name, money);
		dao.insertAccount(dto);
		System.out.println("저장되었습니다.");
	}
	void delete() {
		Scanner scan=new Scanner(System.in);
		System.out.println("삭제할 계좌 번호를 입력하세요");
		String num=scan.nextLine();
		int result=dao.delete(num);
		if(result==1) {
			System.out.println("삭제되었습니다.");
		}else {
			System.out.println("계좌번호를 확인하세요");
		}
	}
	public static void main(String[] args) {
		AccountMagage account = new AccountMagage();
		Scanner scan= new Scanner(System.in);
		while(true) {
			System.out.println("메뉴를 선택하세요(1:계좌목록 2:계좌등록3:계좌삭제 0:종료)");
			int code=scan.nextInt();
			switch(code) {
			case 0: 
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			case 1: 
				account.list();
				break;	
			case 2:
				account.insert();
				break;
			case 3:
				account.delete();
			}
			
		}
	}
}
