package hw4;

import java.util.Scanner;

public class Hw4_5 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入年份:");
		int yyyy = sc.nextInt();
		System.out.print("請輸入月份:");
		int mm = sc.nextInt();
		System.out.print("請輸入日期:");
		int dd = sc.nextInt();
		
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if((yyyy % 4 == 0 && yyyy % 100 !=0) || (yyyy % 400 == 0)) {
			month[1] = 29;
		}
		
		int count = 0;
		for(int i = 0; i < mm - 1; i++) {
			count += month[i];
		}
		System.out.println("輸入的日期為該年第" + (count + dd) +"天");
		
	}
}


// 閏年條件
// (年 % 4 == 0 AND 年 % 100 != 0)
// OR (年 % 400 == 0)