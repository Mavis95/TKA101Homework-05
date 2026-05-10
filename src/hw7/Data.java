package hw7;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Data {
	
	public static void main (String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream(".\\src\\hw7\\Data.txt", true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			PrintStream ps = new PrintStream(bos);
			
			for(int i = 1; i <= 10; i++) {
				ps.print((int) (Math.random() * 1000) + 1 + " ");
			}
			ps.println();
			
			ps.close();
			bos.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
