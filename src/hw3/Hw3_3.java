package hw3;

import java.util.Scanner;

public class Hw3_3 {
	
//	1. 產生1~49的數字 (用for迴圈 )
//	public static void data() {
//		for(int i = 1; i <= 49; i++) {
//			System.out.println(i);
//		}
//	}
//	2. 讓阿文輸入討厭的數字(1~9) 
	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字?");
		int awen = cs.nextInt();
		
//	3. 判斷數字(十位數 & 個位數)
//	4. 印出沒有討厭的數字
//	5. 印出可選號碼的總數
		int count = 0;
		for(int i = 1; i <= 49; i++) {
			if(i / 10 != awen && i % 10 != awen) {
				System.out.print(i + " ");
				count += 1;
					if(count % 6 == 0) {
						System.out.println();
					}
			}
		}
		System.out.println("總共有" + count + "數字可選");
	}
	
	// 用一個陣列物件
//	public void iAarry(int[][] data) {
//		for(int i = 0; i < data.length; i++) {
//			for(int j = 0; j < data[i].length; j++) {
//				System.out.print(data[i][j] + "\t");
//			}
//		}
//	}

	
	
	
	
	

}
