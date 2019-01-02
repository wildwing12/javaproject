package ch04;

public class Break3 {
	public static void main(String[] args) {
		int sum =0;
		int i = 0;
		while(true) {
			if(sum>100) break;
			i++;
			sum +=i;//sum= sum+1
					
		}//여기를 빠져 나가서 다음 것을 실행하라!!!!
		System.out.println("i="+i);
		System.out.println("sum="+sum);
	}

}
