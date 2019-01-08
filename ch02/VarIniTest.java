package ch02;

public class VarIniTest {
	int index = 10;//함수 밖에 이것을 쓰면 이것은 전역 변수 ,초기화 하지 않아도 됨, 멤버변수라고함. 전역변수는 정수일때 0값이 자동 초기화되어 있음
	//값을 넣어 주어도 상관없어
	public static void main(String[] args) {
		int index = 10;//지역변수 초기화(=대입, 할당)
		
		index = index + 1;//inex 변수 (변하는 값)
		System.out.println("index : " + index);// 큰 따옴표로 묵였는지 안묶였는지가 중요하다. 
	}

}
