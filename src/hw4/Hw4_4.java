package hw4;

import java.util.Scanner;

public class Hw4_4 {
	
	public static void main(String[] args) {
		// 寫先陣列
		// scanner
		// 選符合輸入條件的編號

		int[][] data = {
				{25, 2500},
				{32, 800},
				{8, 500},
				{19, 1000},
				{27, 1200},
		};
		
		System.out.print("輸入金額:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print("有錢可借的員工編號:");
		int count = 0;
		for(int i = 0; i < data.length; i++) {
			if(data[i][1] >= n) {
				System.out.print(data[i][0] + " ");
				count += 1;
			}
		}
		System.out.println("共" + count + "人");
	}

}
