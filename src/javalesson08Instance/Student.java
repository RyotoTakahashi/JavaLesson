package javalesson08Instance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Student {
	public static class data{
		//型
		String name;
		ArrayList<Integer> score = new ArrayList<>();
		public void setName(String value){
			name = value;
		}
		public void addScore(int value) {
			score.add(value);
		}
		public void addScore(ArrayList<Integer> value) {
			score.addAll(value);
		}
		public void removeScore(int value) {
			score.remove(value);
		}
		public void removeScore(ArrayList<Integer> value) {
			value.sort(Comparator.reverseOrder());
			for (Integer number : value) {
				score.remove(number);
			}
		}
		public void showScore() {
			System.out.println(score);
		}
		public void average() {
			float size = score.size();
			int sum = 0;
			for (int num : score) {
				sum += num;
			}
			System.out.println(sum/size);
			
		}
		
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		data Alice = new data();
		Alice.setName("Alice");
		Alice.addScore(70);
		Alice.addScore(new ArrayList<>(Arrays.asList(60, 80, 90, 30, 50)));
		Alice.removeScore(4);
		Alice.removeScore(new ArrayList<>(Arrays.asList(2,4)));
		Alice.showScore();
		Alice.average();
		
		
	}

}
