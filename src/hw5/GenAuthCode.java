package hw5;

public class GenAuthCode {

	public static void main(String[] args) {
		String s1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
		System.out.println("本次隨機產生驗證碼為:");
		for(int a = 0; a < 8; a++) {
			int i = (int)(Math.random() * 62);
			System.out.print(s1.charAt(i));
		}
	}
	

//	public void genAuthCode() {
//		int[] x = new int[8];
//		for(int a = 0; a <= 8; i++) {
//			System.out.println(s1.charAt(i));
//		}
//	}
	


	
	



	
	
}
