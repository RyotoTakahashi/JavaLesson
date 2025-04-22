package javalesson01;

public class JavaLesson1_2_double {

	public static void main(String[] args) {
		double num = 4.5;
		double calc = num / 2;
		System.out.println(num + "を半分にすると" + calc + "です");
		num = 7.8;
		int calc2 = (int) num;
		double calc3 = num - calc2;
		System.out.println(num + "の整数部分は" + calc2 + "、小数部分は" + calc3 + "です");
		num = 3.2;
		double calc4 = num * 10;
		System.out.println(num + "を１０倍すると" + calc4 + "です");
	}

}
