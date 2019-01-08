package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListShop {
	public static void main(String[] args) {
		List<Shop> list=new ArrayList<>();
			
		Shop s1=new Shop();
		s1.input();
		Shop s2=new Shop();
		s2.input();
		
		list.add(s1);
		list.add(s2);
		
		System.out.println("제품\t회사\t단가\t수량\t총액");
		for(int i=0; i<list.size(); i++) {
			Shop s = list.get(i);
			System.out.println(s.getName()+"\t"+s.getCompany()+"\t"+s.getPrice()+"\t"+s.getAmount()+"\t"+s.getMoney());
		}
		
		
		
	}
}
