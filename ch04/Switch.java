package ch04;
//성적계산
public class Switch {

	public static void main(String[] args) {
		int kor=85;
		int mat=90;
		int eng=70;
		int tot = kor + mat + eng; //총점
		double avg = tot / 3.0; //평균
		String grade = ""; //등급 초기화
		
		switch((int)(avg/10)) {
		case 10: //case문의 종료는 :(콜론)으로 처리함에 주의
		case 9: grade = "수"; break;
		case 8: grade = "우"; break;
		case 7: grade = "미"; break;
		case 6: grade = "양"; break;
		default: grade = "가";
		}//end switch
		
		//결과 출력
		System.out.println("국어\t수학\t영어\t총점\t평균\t등급");
		System.out.printf("%d\t%d\t%d\t%d\t%4.1f\t%s", 
				kor,mat,eng,tot,avg,grade);
		
	}//end main()
}//end class
