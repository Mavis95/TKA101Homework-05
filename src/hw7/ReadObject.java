package hw7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("C:\\data\\Object.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);

			while (true) {

				Animal animal = (Animal) ois.readObject();
				animal.speak();
			}

		} catch (EOFException e) {
			System.out.println("資料讀取完畢");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}