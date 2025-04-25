package javalesson08Instance;

public class Book {
	public static class BookData{
		String title;
		String author;
		int price;
		public void setTitle(String value){
			title = value;
		}
		public void setAuthor(String value) {
			author = value;
		}
		public void setPrice(int value) {
			price = value;
		}
		
		public void showInfo() {
			System.out.println("書名:"+title+" 著者:"+author+" 価格:"+price);
		}
				
	
	}
	public static void main(String[] args) {
		BookData book = new BookData();
		book.setTitle("Hallo");
		book.setAuthor("Oracle");
		book.setPrice(170);
		
		book.showInfo();
		// TODO 自動生成されたメソッド・スタブ

	}

}
