package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Act {
	public static void main(String[] args) {
		Pice1DTO pice1=new Pice1DTO("kim", "010-111-1111", 31, "123456=1234565", "1234");
		Pice1DTO pice2=new Pice1DTO("lee", "010-222-2222", 32, "223456=1234565", "1234");
		Pice1DTO pice3=new Pice1DTO("park", "010-333-3333", 33, "323456=1234565", "1234");
		Pice1DTO pice4=new Pice1DTO("hong", "010-444-4444", 34, "423456=1234565", "1234");
		
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try {
			fos = new FileOutputStream("d:\\k.dat");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(pice1);
			oos.writeObject(pice2);
			oos.writeObject(pice3);
			oos.writeObject(pice4);
			System.out.println("객체 파일을 저장했습니다."
					+ "");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		try {
			fis=new FileInputStream("d:\\k.dat");
			ois=new ObjectInputStream(fis);
			Pice1DTO dto1=(Pice1DTO)ois.readObject();
			Pice1DTO dto2=(Pice1DTO)ois.readObject();
			Pice1DTO dto3=(Pice1DTO)ois.readObject();
			Pice1DTO dto4=(Pice1DTO)ois.readObject();
			System.out.println(dto1);
			System.out.println(dto2);
			System.out.println(dto3);
			System.out.println(dto4);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
