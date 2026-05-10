package hw7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void CopyFile(String src, String des) {
		
		try {
			FileInputStream fis = new FileInputStream(src);
			FileOutputStream fos = new FileOutputStream(des);
			
			int data;
			while((data = fis.read()) != -1) {
				fos.write(data);
			}
			
			fos.close();
			fis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
