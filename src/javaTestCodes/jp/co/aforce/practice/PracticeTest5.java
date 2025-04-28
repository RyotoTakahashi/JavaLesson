package javaTestCodes.jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Random;

public class PracticeTest5 {
	//Q3,Q4
	public static void mathSquare(int a) {
		int width = String.valueOf((a+9)*(a+9)).length();
		for (int i =a; i <=a+9;i++) {
			String X ="";
			for (int j=a;j<=a+9;j++) {
				String Y = String.valueOf(i*j);
				
				for (int k = 0; k<=(width-Y.length());k++){
					X+=" ";
				}
				;
				X += Y;
			
			}
			System.out.println(X);
		}
	}

	public static void main(String[] args) {
		Random r = new Random();
		//Q1
		int fortune = r.nextInt(5);
		switch (fortune) {
		case 1:
			System.out.println("吉です");
			break;
		case 2:
			System.out.println("中吉です");
			break;
		case 3:
			System.out.println("大吉です");
			break;
		default:
			System.out.println("凶です");
			break;
		}
		;

		//Q2
		ArrayList<Integer> sevens = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				sevens.add(i);
			}
		}
		while (sevens.size() != 1) {
			System.out.print(sevens.getFirst());
			System.out.print(",");
			sevens.remove(0);
		}
		;
		System.out.println(sevens.getFirst());

		//Q3
		mathSquare(1);
		
		//Q4
		mathSquare(31);
		

	}
}
