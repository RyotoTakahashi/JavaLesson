package javalesson06_array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashSetSample {

	public static void main(String[] args) {
		Set<Integer> numList = new HashSet<Integer>();
		numList.add(2);
		numList.add(1);
		numList.add(1);
		numList.add(3);
		System.out.println(numList);

		Map<String, Integer> nameMap = new HashMap<>();
		nameMap.put("Bob", 1);
		nameMap.put("Alice", 2);
		nameMap.put("John", 2);
		nameMap.put("Tom", 1);
		System.out.println(nameMap);

		int value = nameMap.get("Alice");
		System.out.println(value);

		try {
			value = nameMap.get("Tarou");
		} catch (NullPointerException e) {
			System.out.println("ヌルポ......");
			System.out.println("ガッ！！");
		}

		nameMap.remove("Alice");
		System.out.println(nameMap);

	}

}
