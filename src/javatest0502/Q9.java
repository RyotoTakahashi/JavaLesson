package javatest0502;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		System.out.println("商品の単価を入力してください: ");
		int price = sc.nextInt();
		
		System.out.println("購入個数を入力してください: ");
		int amount = sc.nextInt();
		System.out.println("商品の単価;"+price);
		System.out.println("購入個数;"+amount);
		System.out.println("割引前の合計金額;"+price*amount);
		int priceSale = 0;
		
		if (price<=10000) {
			priceSale = price/10;
		}
		else if(price<=5000) {
			priceSale = price/20;
		}
		
		int amountSale = 0;
		if (amount>=5) {
			amountSale = 100*amount;
		}
		else if(amount > 3) {
			amountSale = 50*amount;
		}
		
		int sale = amountSale + priceSale;
		
		System.out.println("割引額;"+sale);
		int correctPrice = price*amount - sale;
		System.out.println("割引後の価格"+correctPrice);
		int tax = correctPrice/10;
		System.out.println("消費税額"+tax);
		int total = tax +correctPrice;
		System.out.println("税込み価格;"+total);
		sc.close();
		//バグの余地あり
		//単価が50円、個数が5個の時など
	}

}
