package javalesson07_if;

public class switchpractice {
	public static void main(String[] args) {
		String color = "yellow";
		String message;
		switch (color) {
		case "red":
			message = "停止してください。";
			break;
		case "yellow":
			message = "注意してください。";
			break;

		case "green":
			message = "進んでください。";

			break;
		default:
			message = "不正な信号の色です。";
		}
		System.out.println("現在の信号: " + color + " - " + message);
	}
}