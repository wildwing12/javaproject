package ch14;

import java.util.ArrayList;
import java.util.List;

//ArrayList : Vector의 사용법과 비슷하지만 좀더 가볍고 속도가 빠름
public class ListExam {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();//
		//실무에서는 큰 자료 타입(interface)인  List를 좌변에 놓고 쓴다.
		//ArrayList에도 다양한 자료형을 저장 할 수 있다.
		list.add("하나");//add(추가할값)
		list.add(2);
		list.add(5.5);
		list.add(false);
		list.add(3, 4);//중간 삽입  add(index, value)
		list.remove(0);
		for(int i=0; i<list.size(); i++)
	
			System.out.print(list.get(i)+"\t");
		
		
	}
	
}
