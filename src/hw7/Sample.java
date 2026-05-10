package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sample {

	public static void main (String[] args) {
		File file = new File(".\\src\\hw7\\Sample.txt");
		
		int zzz = 0;  // 行
		int yyy = 0;  // 字元
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String i;
			while((i = br.readLine()) != null) {
				zzz++;
				yyy += i.length();
			}
			br.close();
			fr.close();
			
			System.out.println("Sample.txt檔案共有" 
				+ file.length() + "個位元組，"
				+ yyy + "個字元，"
				+ zzz + "列資料"
			);
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
