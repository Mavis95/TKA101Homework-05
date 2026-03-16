package hw2;

public class hw2_5 {
	public static void main(String[] args) {
		int i = 0;
		for (int j = 1; j <= 49; j++) {
			if (j / 10 != 4 && j % 10 != 4) {
				System.out.println(j);
				i++;
			}
		}
		System.out.println("共" + i + "個");
	}
}


	//阿文很熱衷大樂透(1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
	//輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
	//用迴圈