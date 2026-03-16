package hw2;

public class hw2_8 {
	public static void main(String[] args) {
		// 一：使用for迴圈+ while迴圈
		int i;
		for (i = 1; i <= 9; i++) {
			int j = 1;
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + i * j + '\t');
				j++;
			}
			System.out.println();
		}
		
		System.out.println("======================================================================");

		// 二：使用for迴圈+ do while迴圈
		int k;
		for (k = 1; k <= 9; k++) {
			int l = 1;
			do {
				System.out.print(k + "*" + l + "=" + k * l + '\t');
				l++;
			} while(l <= 9);
			System.out.println();
		}
		
		System.out.println("======================================================================");
		
		// 三：使用while迴圈+ do while迴圈
		int m = 1;
		while(m <= 9) {
				int n = 1;
				do {
					System.out.print(m + "*" + n + "=" + m * n + '\t');
					n++;
				} while(n <= 9);
				System.out.println();
			m++;
		}
	}
}

	/*
	請建立一個TestNineNine.java程式，可輸出九九乘法表
	• 一：使用for迴圈+ while迴圈
	• 二：使用for迴圈+ do while迴圈
	• 三：使用while迴圈+ do while迴圈
	*/