package hw3;

import java.util.Scanner;

public class Hw3_2 {
	
	public static void main(String[] args) {
		// 亂數產生目標數字0～9
		int i;
		i = (int)(Math.random() * 9);
		System.out.println(i);
		
		// 讀取玩家輸入
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧!");
		int data = sc.nextInt();
		
		// 判斷猜對或猜錯
		while (data != i) {
			System.out.println("猜錯囉");
			data = sc.nextInt();
			
			if (data == i) {
				System.out.println("答對了!答案就是" + i);
			}
			else{
				System.out.print("");
			}
		}
	}
}
