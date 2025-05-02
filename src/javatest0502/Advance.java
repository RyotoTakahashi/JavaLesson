package javatest0502;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Advance {
	//Bookクラスを作成する。
	public static void main(String[] args) {
		// 1
		ArrayList<Book> bookList = new ArrayList<Book>(Arrays.asList(
			new Book("Python入門","山田太郎",1500,2500),
			new Book("データ分析の基礎","鈴木花子",1200,3000),
			new Book("AI技術最前線","佐藤一郎",800,4000),
			new Book("Webデザイン講座","田中美咲",2000,2000),
			new Book("初めての機械学習","中村健一",900,3500)
		));
		
		
		//2
		int total = Book.totalSale(bookList);
		System.out.print("総売り上げ:");
		System.out.println(total);
		
		ArrayList<Book> over1000books = Book.over1000(bookList);
		System.out.print("1000冊を超える本:");
		for (Book b :over1000books) {
			System.out.print(b.getTitle()+",");
		}
		System.out.println();
		
		Collections.sort(bookList, new Book.efficientComparator());
		System.out.print("価格あたりの販売効率が最も高い書籍:");
		for(int i =0; i<1;i++) {
			System.out.println(bookList.get(i).getTitle());
		}
		
		
	}

}
