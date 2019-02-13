package ch20;

import java.net.NetworkInterface;
import java.util.Enumeration;

public class LanInfo {
	public static void main(String[] args) {
		try {
			//NetworkINterface :랜카드의 정보
			Enumeration<NetworkInterface> enu=NetworkInterface.getNetworkInterfaces();
			//getNetworkInterfaces():네트워크 인터네페이스(랜카드)의 
			//다양한 정보 제공
			while(enu.hasMoreElements()) {//다음 요소가 있으면  true
				NetworkInterface net= enu.nextElement();
				System.out.println(net);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
