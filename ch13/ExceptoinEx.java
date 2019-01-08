package ch13;

public class ExceptoinEx {
	public static void main(String[] args) {
		int[] nums= {10,20,30,40,50};
		try {
			for(int i=0; i<=5; i++) {
				System.out.println(nums[i]);
			}
		}catch (Exception e) {
			System.out.println("프로그램 실행중에 문제가 발생했습니다");
		}
		System.out.println("프로그램 종료");
	}
}
