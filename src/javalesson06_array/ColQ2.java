package javalesson06_array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ColQ2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(1);
		numbers.add(4);
		numbers.add(1);
		numbers.add(5);
		
		System.out.println(numbers);
		
		//HashSetに変換
		Set<Integer> numSet = new HashSet<Integer>(numbers);
		System.out.println(numSet);
	}

}
