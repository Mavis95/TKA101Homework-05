package hw4;

public class Hw4_2 {
	//建立字串
	//用迴圈取出
	public static void main(String[] args) {
		String x = "Hello World";
		
		for(int i = x.length() - 1; i >= 0; i--) {
			System.out.print(x.charAt(i));
		}
	}
}
