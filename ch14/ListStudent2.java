package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListStudent2 {
	public static void main(String[] args) {
		List<Student2> s= new ArrayList<>();
		s.add(new Student2(2019001,"홍길동","Java",1,"박교수"));
		s.add(new Student2(2019002,"이순신","JSP",1,"최교수"));
		s.add(new Student2(2019003,"김유신","HTML",1,"김교수"));
		s.add(new Student2(2019004,"사임당","DB",1,"오교수"));
		
		for(Student2 y:s) {
			System.out.println(y.getNum()+"\t"+y.getName()+"\t"+y.getMajor()+"\t"+y.getYear()+"\t"
		+y.getProfessor());
		}
	}
}
