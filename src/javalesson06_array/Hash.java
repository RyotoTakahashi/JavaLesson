package javalesson06_array;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Hash {

	public static void main(String[] args) {
		// Q1
		HashMap<String, Integer> vegetables = new HashMap<>();
		vegetables.put("トマト", 200);
		vegetables.put("キャベツ", 300);
		vegetables.put("人参", 150);
		String key = "人参";
		System.out.println(key + "の値段は" + vegetables.get(key) + "円です");

		//Q2
		HashSet<String> fruits = new HashSet<String>();

		fruits.add("apple");
		fruits.add("banana");
		fruits.add("orange");
		fruits.add("banana");

		System.out.println(fruits);

		//Q3
		HashMap<Integer, String> baceball = new HashMap<>();
		baceball.put(1, "ピッチャー");
		baceball.put(2, "キャッチャー");
		baceball.put(3, "ファースト");
		Set<Integer> position = baceball.keySet();
		Collection<String> name =baceball.values();
		System.out.println(position);
		System.out.println(name);

	}
}
