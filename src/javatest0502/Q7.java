package javatest0502;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = 0;

		while (true) {

			try {
				age = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("数字を入力してください");
				continue;
			}
		}

		if (age < 0) {
			System.out.println("正しい年齢を入力してください");
		} else if (age <= 3) {
			System.out.println("無料です");
		}

		else if (age <= 12) {
			System.out.println("500円");
		}

		else if (age <= 17) {
			System.out.println("800円");
		} else if (age <= 59) {
			System.out.println("700円");
		} else if (age < 130) {
			System.out.println("700円");
		} else {
			System.out.println("正しい年齢を入力してください");
		}
		sc.close();
	}
}
