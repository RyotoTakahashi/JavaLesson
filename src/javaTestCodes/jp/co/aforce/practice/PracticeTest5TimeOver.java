package javaTestCodes.jp.co.aforce.practice;

import java.util.ArrayList;

//時間が足りませんでした。これは未回答問題をタイムアップ後に実装したものです。
public class PracticeTest5TimeOver {
	static ArrayList<Integer> prime(int a) {
		ArrayList<Integer> primeList = new ArrayList<>();
		primeList.add(2);
		int useIndex = 0;
		int i;
		for (i = 2; i < a; i++) {
			if (i > (primeList.get(useIndex) * (primeList.get(useIndex)))) {
				useIndex++;
			}
			boolean isPrime = true;
			for (int j = 0; j <= useIndex; j++) {
				
				if (i % (primeList.get(j)) == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primeList.add(i);
			}
			else {
				continue;
			}
		}
		return primeList;
	}

	public static void main(String[] args) {
		//Q5
		ArrayList<String> employees = new ArrayList<>();
		employees.add("斎藤");
		employees.add("田中");
		employees.add("山田");
		employees.add("鈴木");
		employees.add("高橋");

		ArrayList<String> submitters = new ArrayList<>();
		submitters.add("斎藤");
		submitters.add("高橋");

		ArrayList<String> notSubmitters = new ArrayList<>();
		for (String notSub : employees) {
			if (!submitters.contains(notSub)) {
				notSubmitters.add(notSub);
			}

		}
		System.out.println(notSubmitters);

		//Q6
		ArrayList<Integer> x = prime(100);
		System.out.println(x);
	}
}
