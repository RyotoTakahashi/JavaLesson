package javalesson10overload;

public class Sum {

	public static int sum(int a, int b) {
		return a + b;
	}

	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(sum(2, 4));
		System.out.println(sum(3, 5, 7));
	}

}