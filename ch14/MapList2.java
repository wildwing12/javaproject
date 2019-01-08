package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList2 {
	static void print(Map map) {
		ArrayList<Student> list2=(ArrayList<Student>)map.get("list");
		for(Student s: list2) {
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
		}
		
	}
	public static void main(String[] args) {
		Map<String, Object> map=new HashMap<>();
		List<Student> list=new ArrayList<>();
		list.add(new Student("2017001","홍길동","국사",1, "박교수"));
		list.add(new Student("2017002","이순신","영문",3, "홍교수"));
		list.add(new Student("2017003","사임당","전산",2, "최교수"));
		list.add(new Student("2017004","임꺽정","수학",4, "김교수"));
		map.put("list", list);
		
		print(map);
	}
}
