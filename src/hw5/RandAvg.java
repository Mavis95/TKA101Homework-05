package hw5;

public class RandAvg {

	public static void randAvg() {
		double sum = 0;
		System.out.print("本次亂數結果:");
		for(int i = 1; i <= 10; i++) {
			int r1 = (int)(Math.random() * 101);
			System.out.print(r1 +" ");
			sum += r1;
		}
		System.out.println();
		System.out.println("平均值" + sum / 10);
	}
	
	public static void main(String[] args) {
		randAvg();
	}
}
 