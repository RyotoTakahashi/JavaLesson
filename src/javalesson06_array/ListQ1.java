package javalesson06_array;

import java.util.LinkedList;

public class ListQ1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LinkedList<String> Prefecture = new LinkedList<>();
		Prefecture.add("北海道");
		Prefecture.add("京都府");
		Prefecture.add("沖縄県");

		System.out.println(Prefecture.getFirst());
		System.out.println(Prefecture.getLast());

	}
}
