package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListStudent3 {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		Student st=new Student();
		st.setNum("2019001");
		st.setName("홍길동");
		st.setMajor("Java");
		st.setYear(1);
		st.setProfessor("박교수");
		
		list.add(st);
		for(int i=0; i<list.size(); i++) {
			Student s= list.get(i);
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
		}
	}
}
