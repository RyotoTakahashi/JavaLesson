package javatest0502;

import java.util.ArrayList;
import java.util.Comparator;

public class Book {
	private String title;
	private String author;
	private Integer amount;
	private Integer price;
	
	Book(String title, String author, Integer amount, Integer price){
		this.setTitle(title);
		this.setAuthor(author);
		this.setAmount(amount);
		this.setPrice(price);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public static int totalSale(ArrayList<Book> array) {
		int total = 0;
		for (Book book: array) {
			total += book.getAmount()*book.getPrice();
		}
		return total;
	}
	
	public static ArrayList<Book> over1000(ArrayList<Book> array){
		ArrayList<Book> over = new ArrayList<>();
		for (Book book: array) {
			if (book.getAmount()>1000) {
				over.add(book);
			}
		}
		return over;
		
	}
	
	public static class efficientComparator implements Comparator<Book>{

		@Override
		public int compare(Book o1, Book o2) {
			// TODO 自動生成されたメソッド・スタブ
			return Integer.compare(o2.getAmount()*o1.getPrice(),o1.getAmount()*o2.getPrice());
		}
		
	}

}
