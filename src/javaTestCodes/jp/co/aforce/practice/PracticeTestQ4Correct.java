package javaTestCodes.jp.co.aforce.practice;

import java.util.Calendar;
//当該プログラミングは私が仕様を勘違いしていたため書き直したものです。
public class PracticeTestQ4Correct {
	public static void monthSale(int a) {
		switch (a) {
		case 1:
			System.out.println("冬物セール");
			break;

		case 2, 3, 4:
			System.out.println("春物を売る");
			break;

		case 5:
			System.out.println("春物セール");
			break;

		case 6, 7:
			System.out.println("夏物を売る");
			break;
		case 8:
			System.out.println("夏物セール");
			break;
		case 9:
			System.out.println("秋物セール");
			break;
		case 10, 11, 12:
			System.out.println("冬物を売る");
			break;
		default:
			System.out.println("不正な月です");
			break;
		}

	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Calendar cal = Calendar.getInstance();
		int month =1 +  cal.get(Calendar.MONTH);
		monthSale(month);
		
	}

}
