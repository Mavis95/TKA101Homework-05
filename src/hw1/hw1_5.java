package hw1;

public class hw1_5 {

	public static void main(String[] args) {
		int pv = 150;
		double r = 0.02;
		int n = 10;
		System.out.println("本利和=" + pv * Math.pow(1 + r, n) + "萬元");
		
	}
	
}


	/*某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
	金加利息共有多少錢(用複利計算，公式請自行google)
	*/

	// 本利和FV=本金PV* [(1+利率R)]期數(n)次方

