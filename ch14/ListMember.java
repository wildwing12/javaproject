package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListMember {
	public static void main(String[] args) {
		List<Member> list= new ArrayList<>();//ArrayList생성

		Member m1= new Member();
		m1.setName("김철수");
		m1.setUserid("kim");
		m1.setPasswd("1234");
		m1.setTel("02-0000-0000");
		m1.setEmail("kim@naver.com");
		
		list.add(m1);//ArrayList에 Member(의 data)를 추가
		
		System.out.println("이름\t아이디\t비번\t전화\t\t이메일");

		for(int i=0; i<list.size(); i++) {
			Member m=list.get(i);//여기서의 m은 ArrayList의 각 데이터를
			//가리킬 임시 참조 변수로 활용
			System.out.println(list.size());
			System.out.println(m.getName()+"\t"+m.getUserid()+"\t"+m.getPasswd()
			+"\t"+m.getTel()+"\t"+m.getEmail());
			System.out.println();
			
		}
	}
}

