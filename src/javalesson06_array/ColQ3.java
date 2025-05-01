package javalesson06_array;

import java.util.ArrayList;

public class ColQ3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<String> Fruits = new ArrayList<>();
		Fruits.add("リンゴ");
		Fruits.add("バナナ");
		Fruits.add("さくらんぼ");
		Fruits.remove("バナナ");
		Fruits.add("オレンジ");
		
		System.out.println(Fruits);
	}

}
