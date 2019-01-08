package ch06;
//리턴 값이 있는 예제
public class Return {
	static int sum(int a) {
		int result=0;
		for(int i=1; i<=a; i++) {
			result = result +i;
			
		}
		return result;//메소드를 호출할 곳으로 값을 되돌려줌.
		
	}
	public static void main(String[] args) {
		int n=sum(50);
		System.out.println(n);
		n=sum(100);//다시 호출(100을 전달하면서)
		System.out.println(n);
		
	}


}
