package ch21;

import java.util.List;
import java.util.Scanner;

public class AdressManage {
	public AddressDAO dao = new AddressDAO();

	void list() {
		List<AddressDTO> items = dao.listAdress();
		System.out.println("--------------------------------------------------------");
		System.out.println("이름\t주소\t\t핸드폰 \t\t이메일");
		
		System.out.println("========================================================");
		for (AddressDTO dto : items) {
			System.out.print(dto.getName() + "\t");
			System.out.print(dto.getAddr() + "\t\t");
			System.out.print(dto.getHp() + "\t");
			System.out.println(dto.getEmail() + "\t");
		}
		System.out.println("--------------------------------------------------------");

	}// end list
	void insert() {
		Scanner scan=new Scanner(System.in);
		System.out.println("이름:");
		String name=scan.nextLine();
		System.out.println("주소:");
		String addr=scan.nextLine();
		System.out.println("hp");
		String hp=scan.nextLine();
		System.out.println("이메일");
		String email=scan.nextLine();
		AddressDTO dto=new AddressDTO(email, name, addr, hp);
		dao.insertAddress(dto);
		System.out.println("저장되었습니다.");
	}
	void delete() {
		Scanner scan=new Scanner(System.in);
		System.out.println("삭제할 이메일을 입력하세요.");
		String email=scan.nextLine();
		int result=dao.delete(email);
		if(result==1) {
			System.out.println("삭제되었습니다.");
		}else {
			System.out.println("이메일을  확인하세요.");
		}
		
	}
	public static void main(String[] args) {
		AdressManage address = new AdressManage();
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("메뉴를 선택하세요(1:주소목록2:주소록등록3:주소록삭제0:종료)");
			int code = scan.nextInt();
			switch (code) {
			case 0:
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
				break;
			case 1:
				address.list();
				break;
			case 2:
				address.insert();
				break;
			case 3:
				address.delete();
				break;
			}
		}
	}
}
