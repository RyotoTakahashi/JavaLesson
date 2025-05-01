package javalesson07_if;

import java.util.ArrayList;
import java.util.Scanner;

public class IfControl {

	public static void main(String[] args) {
		//Q1
		Scanner sc = new Scanner(System.in);
		System.out.println("整数を入力");
		int num = Integer.parseInt(sc.nextLine());
		if (num % 2 == 0) {
			System.out.println("偶数");
		} else {
			System.out.println("奇数");
		}
		//Q2
		System.out.println("整数を入力");
		num = Integer.parseInt(sc.nextLine());
		if (num > 0) {
			System.out.println("正の数");
		} else if (num < 0) {
			System.out.println("負の数");
		} else {
			System.out.println("０");
		}
		//Q3
		ArrayList<Integer> tri = new ArrayList<>();
		System.out.println("整数を入力");
		tri.add(Integer.parseInt(sc.nextLine()));
		System.out.println("整数を入力");
		tri.add(Integer.parseInt(sc.nextLine()));
		System.out.println("整数を入力");
		tri.add(Integer.parseInt(sc.nextLine()));

		tri.sort(null);
		if (tri.get(2) < tri.get(0) + tri.get(1)) {
			System.out.println("三角形は作図可能");
		} else {
			System.out.println("三角形は作図不可能");
		}
		//Q4
		System.out.println("年齢を入力");
		int age = Integer.parseInt(sc.nextLine());
		String fee;
		if (age <= 12) {
			fee = "無料";
		} else if (age > 60) {
			fee = "500円";
		} else {
			fee = "1000円";
		}
		System.out.println("料金は" + fee + "です");

		//Switch Q3
		System.out.println("1～7の整数を入力");
		num = Integer.parseInt(sc.nextLine());
		switch (num) {

		case 1:
			System.out.println("月");
			break;
		case 2:
			System.out.println("火");
			break;
		case 3:
			System.out.println("水");
			break;
		case 4:
			System.out.println("木");
			break;
		case 5:
			System.out.println("金");
			break;
		case 6:
			System.out.println("土");
			break;
		case 7:
			System.out.println("日");
			break;
		default:
			System.out.println("1〜7の整数を入力してください");
		}

		//Q4
		System.out.println("月の番号（1～12）を入力してください:");
		num = Integer.parseInt(sc.nextLine());

		switch (num) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("1～12の整数を入力してください");
		}

		System.out.println("成績を入力してください（A, B, C, D, F）");
		String grade = sc.nextLine();

		switch (grade) {
		case "A":
			System.out.println("秀");
			break;
		case "B":
			System.out.println("優");
			break;
		case "C":
			System.out.println("良");
			break;
		case "D":
			System.out.println("可");
			break;
		case "F":
			System.out.println("不可");
			break;
		default:
			System.out.println("A, B, C, D, F のいずれかを入力してください");
		}

		sc.close();
	}

}
