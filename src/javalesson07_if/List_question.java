package javalesson07_if;

import java.util.ArrayList;
import java.util.List;

public class List_question {
	public static void main(String[] args) {
		List<Integer> test_score = new ArrayList<Integer>();
		test_score.add(85);
		test_score.add(92);
		test_score.add(78);
		test_score.add(65);
		test_score.add(98);
		test_score.add(70);
		List<Integer> over70 = new ArrayList<Integer>();
		int i = 0;
		for (Integer test_pass:test_score) {
			if (test_pass >= 70) {
				over70.add(test_pass);
				i++;
			}
		}
		System.out.println("70点以上の得点の数は"+i+"個です");
	}

}
