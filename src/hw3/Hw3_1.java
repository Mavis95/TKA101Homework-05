package hw3;

import java.util.Scanner;

public class Hw3_1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input numbers");
		int data1 = sc.nextInt();
		int data2 = sc.nextInt();
		int data3 = sc.nextInt(); //可以跑回圈+陣列精簡這三行
//		System.out.println(data1 + data2 + data3);
		
		if (data1 == data2 && data2 == data3) {
			System.out.println("正三角形");
		}
		else if (data1 == data2 || data2 == data3 || data1 == data3){
			System.out.println("等腰三角形");
		}

		else if (data1 + data2 > data3 && data2 + data3 > data1 && data1 + data3 > data2) {
			System.out.println("其它三角形");
		}
		else if (data1 + data2 <= data3 || data2 + data3 <= data1 || data1 + data3 <= data2) {
			System.out.println("不是三角形");
		}
	}
}
