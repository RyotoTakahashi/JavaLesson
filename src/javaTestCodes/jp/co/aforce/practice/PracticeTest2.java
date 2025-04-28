package javaTestCodes.jp.co.aforce.practice;

public class PracticeTest2 {
	public static void main(String[] args){
		//Q1
		double TAX = 10;
		System.out.println("消費税率"+TAX+"%");
		
		//Q2
		int x = 480;
		double price = x * (TAX+100)/100;
		System.out.println(price);
		
		//Q3
		String name = "髙橋嶺斗";
		System.out.println(name);
		
		//Q4
		System.out.println("この商品の値段は"+price+"円です");
	}

}
