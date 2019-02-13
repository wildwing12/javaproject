package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ActDTO {
	public static void main(String[] args) {
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		MemDTO m1=new MemDTO("kim", 12, "111-111", "1234");
		MemDTO m2=new MemDTO("lee", 13, "222-222", "1234");
		MemDTO m3=new MemDTO("park", 14, "333-333", "1234");
		MemDTO m4=new MemDTO("hong", 15, "444-444", "1234");
		
		try {
			fos= new FileOutputStream("d:\\act.txt");
			oos= new ObjectOutputStream(fos);
			oos.writeObject(m1);
			oos.writeObject(m2);
			oos.writeObject(m3);
			oos.writeObject(m4);
		} catch (Exception e) {
			e.printStackTrace();
		}
			FileInputStream fis=null;
			ObjectInputStream ois=null;
			try {
				fis=new FileInputStream("d:\\act.txt");
				ois=new ObjectInputStream(fis);
				MemDTO dto1=(MemDTO)ois.readObject();
				MemDTO dto2=(MemDTO)ois.readObject();
				MemDTO dto3=(MemDTO)ois.readObject();
				MemDTO dto4=(MemDTO)ois.readObject();
				System.out.println(dto1);
				System.out.println(dto2);
				System.out.println(dto3);
				System.out.println(dto4);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}
