package hw6;

import java.util.Scanner;

public class CalTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("請輸入x的值:");
			int x1 = sc.nextInt();
			System.out.print("請輸入y的值:");
			int y1 = sc.nextInt();
		
			try {
				Calculator c1 = new Calculator(x1, y1) ;
				System.out.println(c1.powerXY());
				break;
			} catch (CalException e) {
				System.out.println(e.getMessage());

			}
		}

	}
}
