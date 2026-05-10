package hw4;

public class Hw4_3 {
	//建立字串
	//用迴圈比對每一個字元
	public static void main (String[] args) {
		String[] x = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int count = 0;
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length(); j++) {
				if(x[i].charAt(j) == 'a' || x[i].charAt(j) == 'e' || x[i].charAt(j) == 'i' || x[i].charAt(j) == 'o' || x[i].charAt(j) == 'u') {
//					System.out.print(x[i].charAt(j) + " ");
					count += 1;
				}
			}
		}
		System.out.println("母音總共:" + count + "個");
	}
}
