package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListMember2 {
	public static void main(String[] args) {
		List<Member> list= new ArrayList<>();
		list.add(new Member("홍길동","hong","1234","02-123-1234","hong@gmail.com"));
		
		for(Member m:list) {
			System.out.println(m.getName()+"\t"+m.getUserid()+"\t"+m.getPasswd()+"\t"+m.getTel()+"\t"+m.getEmail());
		}
		
	}
}
