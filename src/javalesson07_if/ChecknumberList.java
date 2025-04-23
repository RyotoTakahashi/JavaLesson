package javalesson07_if;

import java.util.ArrayList;
import java.util.List;

public class ChecknumberList {
	public static void main(String[] args) {
		int X = 8;
		List<String> checker = new ArrayList<String>();
		if (X>10) {
			checker.add("Large");
		}else {
			checker.add("small");
		}
		System.out.println(checker);

	}

}
