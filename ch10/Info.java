package ch10;

public class Info {
	//만약 회사 정보가 Info파일로 여러군데 사용된다면 편리
	public static void main(String[] args) {
		//static 맴버 사용: 클래스 이름. 상수 변수 이름
		System.out.println("회사명  : "+Constants.COMPANY_NAME);
		System.out.println("전화번호 : "+Constants.TEL);
		System.out.println("주소 : "+Constants.ADD);
	}
}
