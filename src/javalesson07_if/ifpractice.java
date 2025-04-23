package javalesson07_if;

public class ifpractice {

	public static void main(String[] args) {
		int a = 20;
		int b = 20;
		if (a == b) {
			System.out.println("aとbの値は同じ");
		}
		boolean isRayny = true;
		if (isRayny) {
			System.out.println("傘を持っていきましょう");
		}
		int temperature = 25;
		if (temperature >= 30) {
			System.out.println("真夏日です。");
		} else {
			System.out.println("真夏日ではありません。");
		}

		int score = 75;
		if (score >= 80) {
			System.out.println("優");
		} else if (score >= 70) {
			System.out.println("良");
		} else if (score >= 60) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}
		int time = 14;
		boolean isHoliday = false;
		if (time >= 0 && time <= 9 && !isHoliday) {
			System.out.println("UTC勤務時間内です。");
		} else {
			System.out.println("UTC勤務時間外です。");
		}

		boolean hasLicense = true;
		boolean hasCar = true;
		if (hasLicense) {
			System.out.println("運転免許を持っています。");
			if (hasCar) {
				System.out.println("車を持っています。");
			} else {
				System.out.println("車を持っていません。");
			}
		} else {
			System.out.println("運転免許を持っていません。");
		}
	}
}
