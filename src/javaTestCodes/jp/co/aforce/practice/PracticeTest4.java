package javaTestCodes.jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.List;

public class PracticeTest4 {

	//Q2
	public static void main(String[] args) {
		List<String> Animals = new ArrayList<>();
		Animals.add("犬");
		Animals.add("猫");
		Animals.add("うさぎ");
		Animals.add("へび");

		//Q3
		String faborite = "犬";
		if (Animals.contains(faborite)) {
			System.out.println(faborite + "はリストに含まれています");
		} else {
			System.out.println(faborite + "はリストに含まれていません");
		}
		;

		//Q4(誤答)
		int Month = 4;
		Calander.month(Month);
	}

	public static class Calander {
		public static void month(int a) {
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

	}

}