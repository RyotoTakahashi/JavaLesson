package javalesson06_array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fruitsshop {
	public static void main(String[] args) {
		Map<String, Integer> shoplist = new HashMap<>();
		int apple = 100;
		int orange = 80;
		int banana = 120;
		int strawberry = 300;

		shoplist.put("りんご", apple);
		shoplist.put("みかん", orange);
		shoplist.put("バナナ", banana);
		shoplist.put("いちご", strawberry);

		Scanner scanner = new Scanner(System.in);
		String orderfruits = scanner.nextLine();
		Integer value = shoplist.get(orderfruits);
		if (value != null) {
			System.out.println(orderfruits + "は" + value + "円です。");
		} else {
			System.out.println("申し訳ありませんが、その商品は取り扱っておりません");
		}
		scanner.close();
	}
}
