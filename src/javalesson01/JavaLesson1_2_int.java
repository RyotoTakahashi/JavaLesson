package javalesson01;

public class JavaLesson1_2_int {

	public static void main(String[] args) {
		int num = 0;
		if (num == 0) {
			System.out.println(num+"は0です");
		}
		else {
			System.out.println(num+"は0ではありません");
		}
		num = -5;
		if (num < 0) {
		System.out.println(num+"は負の数です");
		}
		else {
			System.out.println(num+"は負の数ではありません");
		}
		num = 15;
		if(num%5 == 0) {
			System.out.println(num+"は5の倍数です");
		}
		else {
			System.out.println(num+"は5の倍数ではありません");
		}
	}

}
