package ch06;

public class ReturnDemo {
	public static void main(String[] args) {
		printScore(99);
		printScore(120);
	}//end main
	public static void printScore(int score) {
		if(score<=0 ||score>=100) {
			System.out.println("잘못된 점수 : " + score);
			return;//생략 가능(void있을시),if문에 이것이 있으면 메소드를 끝내고 호출한 곳으로 복귀 , 리턴을 만나면 무조건  메소드 종료
			
		}
		System.out.println(" 점수 :" +score);
	}//end printScore
}
