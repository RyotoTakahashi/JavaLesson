package javalesson06_array;

import java.util.ArrayList;
import java.util.Collections;

public class ColQ1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(1);
		numbers.add(4);
		numbers.add(1);
		numbers.add(5);
		
		System.out.println(numbers);
		
		//反転
		Collections.reverse(numbers);
		System.out.println(numbers);
		
	}
}
