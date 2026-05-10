package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DogCat {

	public static void main (String[] args) {
		try {
			File dir = new File("C:\\data");
			if (!dir.exists()) {
				dir.mkdir();
			}
			
			Cat cat = new Cat("DDDDD");
			Dog dog = new Dog("CCCCC");
			
			FileOutputStream fos = new FileOutputStream("C:\\data\\Object.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(cat);
			oos.writeObject(dog);
			
			oos.close();
			fos.close();
			
			System.out.println("資料讀取完畢！");
			
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}	
