package ch20;

import java.net.InetAddress;

public class InetAddressExam {
	public static void main(String[] args) {
		try {
			InetAddress address=InetAddress.getByName("naver.com");
			System.out.println(address);//호스트 이름과 ip주소
			System.out.println(address.getHostName());
			System.out.println(address.getHostAddress());//ip주소
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
