package javalesson10class;

public class Book {
	//型
		String title;
		String author;
		Integer price;
		
		//コンストラクタ
		Book(String t,String a, Integer p){
			this.title = t;
			this.author = a;
			this.price = p;
		}
		Book(String t,String a){
			this.title = t;
			this.author = a;
		}
}