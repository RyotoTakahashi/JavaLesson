package javalesson08Instance;

public class Myname {
	public static class Indivisual {
		//型
		String name;
		int age;

		//コンストラクタの指定
		Indivisual(String N, int A) {
			this.name = N;
			this.age = A;
		}

		Indivisual(String N) {
			this.name = N;
		}

		Indivisual(int A) {
			this.age = A;
		}

		Indivisual() {
		}

		//関数定義
		public void setName(String value) {
			name = value;
		}

		public void setAge(Integer value) {
			age = value;
		}

		public void showData() {
			System.out.println("名前は" + name + "です。年齢は" + age + "才です。");
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Indivisual Ryoto = new Indivisual("髙橋嶺斗",22);
		Ryoto.showData();
	}
}
