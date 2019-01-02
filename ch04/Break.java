package ch04;
//break(탈출문)
public class Break {

	public static void main(String[] args) {
		int i=1;
		//break문은 switch, for, while, if, do~while에서 모두 사용 됨.
		while(true) {//무한 반복
			System.out.println(i++);
			if(i>10) break;//반복문 종료
			
		}
		//System.out.println("프로그램 종료");
		

	}

}
