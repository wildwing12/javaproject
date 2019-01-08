package ch05;

public class ForeachEx {
	enum Week{월, 화, 수, 목, 금, 토 , 일}//enum은 배열 보다 간편하게 쓰는방식으로 단지 데이터를 나열해서 쓰기만 하면됨.
	//메인 메소드 밖에서 써야 한다.
	
	public static void main(String[] args) {
		int[] n= {1,2,3,4,5};
		String names[]= {"사과","배", "바나나","체리","딸기", "포도"};
		int sum=0;
		//확장된 for 문 에서 k는 n[0], m
		for(int k:n) {
			System.out.print(k+" ");
			sum+=k;
		}
		System.out.println("합은 :"+sum);
		//s는 names[0], names[1]...names[5]
		for(String s :names) {
			System.out.println(s+" ");
		}
		//dya는 월, 화, 수 , 목, 금, 토 , 일
		System.out.println();{
		for (Week day: Week.values())
			System.out.print(day);
		}
	}

}
