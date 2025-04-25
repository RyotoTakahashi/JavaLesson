package javalesson06_array;

import java.util.ArrayList;

public class ListQ2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Integer> number = new ArrayList<>();
		number.add(1);
		number.add(7);
		number.add(3);
		number.add(2);
		number.add(0);
		
		System.out.println(number.contains(8));
		System.out.println(number.contains(1));
		
	}

}
