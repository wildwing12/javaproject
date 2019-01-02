package ch04;
//do~while문을 이용하여 'a'부터'z'까지 출력
public class Do_while_char {
	public static void main(String[] args) {
		char c= 'a';//초기식
		do {
			System.out.print(c);
			c=(char)(c+1);//영문의 경우 1일 더하면 다음문자의 코드 값(증감식)
			
		}while(c<='z');//조건식
	}

}
