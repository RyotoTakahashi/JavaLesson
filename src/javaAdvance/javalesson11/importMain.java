package javaAdvance.javalesson11;

import static java.lang.Math.*;
import static javaAdvance.javalesson11.Utility.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class importMain {

	public static void main(String[] args) {
		//Q1,2
		ArrayList<String> li = new ArrayList<>();
		li.add("Alpha");
		li.add("Beta");
		li.add("Gamma");
		System.out.println(li);
		Scanner sc = new Scanner(System.in);
		String appends = "3";
		while (!appends.equals("0")) {
			System.out.println("配列に追加するときは1,配列を確認するときは2,終了するときは0を入力してください");
			appends = sc.nextLine();
			if (appends.equals("1")) {
				System.out.println("配列に追加する文字列を入力してください");
				li.add(sc.nextLine());
			}
			else if (appends.equals("2")) {
				System.out.println("どののインデックスを表示しますか?（すべてのインデックスを表示する場合は-1）");
				int num = Integer.parseInt(sc.nextLine());
				if(num == -1) {
					System.out.println(li);
				}
				else if(num >= li.size()){
					System.out.println("再入力してください");
				}
				else {
					System.out.println(li.get(num));
				}
				
			}
		}
		
		//Q3
		System.out.println("円の面積 半径を入力してください");
		int r = Integer.parseInt(sc.nextLine());
		System.out.println(r*r*PI);
		
		//Q40
		greet();
		
		//Q5
		ArrayList<Integer> randomList = new ArrayList<>();
		System.out.println("必要なランダムな数値の上限を入力してください");
		int UpperLim = Integer.parseInt(sc.nextLine());
		System.out.println("必要なランダムな数値の下限を入力してください");
		int LowerLim = Integer.parseInt(sc.nextLine());
		System.out.println("必要なランダムな数値の個数を入力してください");
		int Amounts = Integer.parseInt(sc.nextLine());
		for(int i=0; i<Amounts; i++) {
			Random random = new Random();
			randomList.add(random.nextInt(UpperLim-LowerLim)+LowerLim);
		}
		System.out.println(randomList);
		
		//Q6
		System.out.println(sqrt(10));
		System.out.println(pow(3,2));
		System.out.println(16*atan(1.0/5)-4*atan(1.0/239));
		
		sc.close();
	}

}
