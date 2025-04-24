package javalesson02_variety;

public class Q7 {

	public static void main(String[] args) {
		String item = "Laptop";
		int value = 1200;
		int amount = 3;
		String sentence = String.format("商品:%s, 価格: %d円, 個数: %d,合計は%d円です",item,value,amount,value*amount);
		System.out.println(sentence);
	}

}
