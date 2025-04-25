package javalesson08Instance;

public class Taiyaki {
	String filling;
	
	//中身をセットするメソッド
	
	public void setFilling(String value) {
		filling = value;
	}
	
	//中身を表示するメソッド
	public void showFilling( ) {
		System.out.println("このたい焼きの中身は："+filling+"です。");
	}

}
