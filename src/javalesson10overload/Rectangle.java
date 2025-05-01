package javalesson10overload;

public class Rectangle {
	public static void area(int a, int b) {
		System.out.println(a * b);
	}

	public static void area(int a) {
		System.out.println(a * a);
	}

	public static void main(String args[]) {
		area(3);
		area(4, 2);
		area(2);

	}

}
