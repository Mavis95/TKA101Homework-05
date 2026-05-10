package hw5;

import java.util.Scanner;

public class StarSquare {
	
	private int width;
	private int height;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬與高:");
		width = sc.nextInt();
		height = sc.nextInt();
	}
	
	public StarSquare() {
	}
	
	public void speak() {
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		StarSquare userStar = new StarSquare();
		userStar.input();
		userStar.speak();
	}

}
