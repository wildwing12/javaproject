package ch21;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class EmpManage {
	void insert() {
		Scanner scan = new Scanner(System.in);
		System.out.print("사번:");
		int empno = scan.nextInt();
		System.out.print("이름:");
		String ename = scan.next();
		System.out.print("입사일자:");
		String hiredate = scan.next();
		System.out.print("급여");
		int sal = scan.nextInt();
		EmpDTO dto = new EmpDTO(empno, ename, Date.valueOf(hiredate), sal);
		dao.insertEmp(dto);
		System.out.println("저장되었습니다.");
	}

	EmpDAO dao = new EmpDAO();// EmpManage가 메모리에 올라가는 시점에
	// 자동으로 EmpDAO도 new를 실행하면서 동시에 메모리에 올리간다.

	void delete() {
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 사번을 입력하세요");
		int empno = scan.nextInt();
		int result = dao.deleteEmp(empno);
		if (result == 1) {
			System.out.println("삭제되었습니다.");

		} else
			System.out.println("사번을 확인하세요");

	}

	// 사원목록 출력
	void list() {
		// 사원목록을 받아옴
		List<EmpDTO> items = dao.listEmp();
		System.out.println("사번\t이름\t 입사일자\t\t급여");
		for (EmpDTO dto : items) {// for(개별값:집합)
			System.out.print(dto.getEmpno() + "\t");
			System.out.print(dto.getEname() + "\t");
			System.out.print(dto.getHiredate() + "\t");
			System.out.println(dto.getSal() + "\t");
		}
	}

	public static void main(String[] args) {
		EmpManage emp = new EmpManage();
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("메뉴를 선택하세요(1:목록2:추가3:삭제4:종료)");
			int code = scan.nextInt();
			switch (code) {
			case 0:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			case 1:
				emp.list();
				break;
			case 2:
				emp.insert();
				break;
			case 3:
				emp.delete();
				break;

			}
		}

	}

}
