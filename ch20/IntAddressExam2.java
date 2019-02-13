package ch20;

import java.net.InetAddress;

public class IntAddressExam2 {
	public static void main(String[] args) {
		try {
			//getAllByname(ur1)=>여러개의 ip주소를 배열로 저장
			InetAddress[] address=InetAddress.getAllByName("daum.net");
			for(int i=0; i<address.length; i++) {
				System.out.println(address[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
