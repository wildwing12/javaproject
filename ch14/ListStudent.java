package ch14;

import java.util.ArrayList;
import java.util.List;

class ListStudent {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		
		//new할때마다 실제로 새로운 주소를 가진 생성자에 값이 처리된다.
		list.add(new Student("2019001","김철수","국사",1,"박교수"));
		list.add(new Student("2019002","박철수","영문",1,"최교수"));
		list.add(new Student("2019003","이철수","전산",1,"김교수"));
		
		
//		for(int i=0; i<list.size(); i++) {
//			Student s=list.get(i); //리스트.get(인덱스)
//			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
//		}
//		
		for(Student s:list) {//자바1.5Varsion부터 가능
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
		}
	}
}
