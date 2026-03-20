package hw4;

public class Hw4_1 {
	
	public static void main(String[] args) {
		// 寫出陣列
		int[] intArray = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0;
		for(int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}
		System.out.println("平均:" + sum / intArray.length);	
		System.out.print("大於平均值的元素:");
			for(int i = 0; i < intArray.length; i++) {
				if(intArray[i] > (sum / intArray.length)) {
					System.out.print(intArray[i] + " ");
				}
			}
	}
	

	
	// 算出平均值
	// 印出大於平均值的數
}
