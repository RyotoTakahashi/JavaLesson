package javaTestCodes.jp.co.aforce.practice;

import java.util.ArrayList;

public class PracticeTest3 {

	public static void main(String[] args) {
		// Q1
		ArrayList<String> marchant = new ArrayList<>();
		marchant.add("シャープペンシル");
		marchant.add("ボールペン");
		marchant.add("リングノート");
		marchant.add("クリップ");
		marchant.add("消しゴム");	
		
		//Q2
		System.out.println(marchant.get(1));
		
		//Q3
		ArrayList<String> employee = new ArrayList<>();
		employee.add("山田太郎");
		employee.add("鈴木花子");
		employee.add("佐藤二朗");
		employee.add("山田太郎");
		employee.add("高橋三郎");
		
		//Q5
		System.out.println(employee.get(2));
		
		//Q6
		ArrayList<Integer> list1 = new ArrayList<>();				
		list1.add(10);
		list1.add(15);
		list1.add(16);
		list1.add(19);
		
		ArrayList<Integer> list2 = new ArrayList<>();				
		list2.add(11);
		list2.add(12);
		list2.add(18);
		list2.add(20);
		
		ArrayList<Integer> margeList = new ArrayList<>();
		margeList.addAll(list1);
		margeList.addAll(list2);
		margeList.sort(null);

		for (int num:margeList) {
			System.out.println(num);
		}
		
		//Q7
		ArrayList<Integer> list3 = new ArrayList<>();				
		list3.add(13);
		list3.add(14);
		list3.add(17);
		list3.add(21);
		list3.sort(null);
		
		System.out.println(margeList);
		System.out.println(list3);
	}

}
