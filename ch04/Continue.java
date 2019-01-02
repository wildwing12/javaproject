package ch04;

public class Continue {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%5==0) continue;// 5의 배수를 만나면  이하 코드를 무시하고 다음 단계로 계속해라.
			System.out.println(i);
		}
	}

}
