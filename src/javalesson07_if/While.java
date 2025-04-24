package javalesson07_if;

public class While {

	public static void main(String[] args) {
		int i = 5;
		System.out.println(i);
		System.out.println("----whileの入力----");
		while (i < 5) {
			System.out.println("iの値: " + i);
			i++;
		}
		System.out.println("----whileの入力----");
		i = 0;
		System.out.println("----iのリセット----");
		System.out.println(i);
		i = 5;
		System.out.println("----iの再設定----");
		System.out.println(i);
		System.out.println("----do-whileの入力----");
		do {
			System.out.println("iの値: " + i);
			i++;
		} while (i < 5);
		System.out.println("----do-whileの入力----");
	}

}
