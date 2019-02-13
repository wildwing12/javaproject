package ch14;

import java.util.Vector;

public class VcetorExam {
	public static void main(String[] args) {
		Vector<Object> v=new Vector<>();
		// 모든 자료형 처리 가능
		//사이즈가 자동으로 늘어남
		System.out.println("초기사이즈 : "+v.capacity());//길이값 확인
		//벡터는 기본적으로 10기의 사이즈를 만들어 놓는데
		v.add("first");//add("추가할 자료)
		v.add(2);
		v.add(3.5);
		v.add(true);
		v.add(100);
		v.add(101);
		v.add(102);
		v.add(103);
		v.add(104);
		v.add(105);
		v.add(106);
		v.add(107);
		
		System.out.println("중간 사이즈"+v.capacity());
		//입력된 데이터가 벡터가 만들어 놓은 초기 10개의 사이즈가 넘어가
		//또 10개의 사이즈를 추가로 만든다.
		System.out.println("데이터의 갯수 : "+v.size());
		//size()로 실제데이터 갯수를 파악, 배열의 length와 같다.
		
		System.out.println("초기 데이터");
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+"\t");
		}
		System.out.println();
		
		v.remove(0);
		System.out.println("초기 데이터");
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+"\t");
			
		}
		System.out.println();
		v.add(0, "first");
		System.out.println("초기 데이터");
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+"\t");
			
		}
	}
}
