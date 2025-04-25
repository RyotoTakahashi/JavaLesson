package javalesson06_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListQ3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<String> alphabet = new ArrayList<>(Arrays.asList("a", "l", "p", "h", "a", "b", "e", "t"));
		Collections.sort(alphabet);
		System.out.println(alphabet);
	}

}
