package ch09;

public class VolumeUse {
	public static void main(String[] args) {
		Volume vol=new Volume();
		System.out.println("부피 : "+vol.getVolume());
		Volume vol2=new Volume(10,20,30);
		System.out.println("부피 : "+vol2.getVolume());
		
	}
}
