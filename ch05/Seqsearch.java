package ch05;

import java.util.Scanner;

public class Seqsearch {
	public static void main(String[] args) {
	int s[] = {0,10,20,30,40,50,60,70,80,90,100};
	int value;
	int index= 100;
	
	Scanner scan = new Scanner(System.in);
	System.out.println("(보기 : 0 10 20 30 40 50 60 70 80 90 100");
	System.out.print("위 숫자 중 탐색할 값을 입력하시오.: ");
	value = scan.nextInt();
	
	for (int i=0; i<s.length; i++) {
		if(s[i] ==value)//입력한 숫자와  for문을 돌며 순차적 배열 인덱스에 있는 값과 비교하여 같으면 아래 수행
			index = i;
		
	}
	if (index<s.length && index>=0)//true&&true=>true
	System.out.println(""+value+"값은 index"+index+" 의 위치에 이습니다.");

}
}
