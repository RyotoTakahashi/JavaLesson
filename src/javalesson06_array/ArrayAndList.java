package javalesson06_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAndList {
	public static void main(String[] args) {
		// Q1
		Integer[] num = {3,1,4,1,5,9,2};
		ArrayList<Integer> numList = new ArrayList<>();
		numList.addAll(Arrays.asList(num));
		System.out.println(Arrays.toString(num));
		
		
	//Q2
		ArrayList<String> Word = new ArrayList<>();
		Word.add("One");
		Word.add("Two");
		Word.add("Three");
		String WordArray[] = Word.toArray(new String[Word.size()]);
		System.out.println(Arrays.toString(WordArray));
		
	//Q3
		List<String> studentName = Arrays.asList("Alice", "Bob", "Cate","David");//Array$ArrayList(固定長)
		int[] studentScore = {60,80,90,40};
		double studentNum = (double)studentName.size();
		int sum = Arrays.stream(studentScore).sum();
		System.out.println(studentScore[studentName.indexOf("Alice")]);
		double average = sum/studentNum;
		System.out.println(average);
	}

}
