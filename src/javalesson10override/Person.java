package javalesson10override;

public class Person {
	String name;
	int age;

	Person(String n, Integer a) {
		this.name = n;
		this.age = a;
	}

	@Override
	public String toString() {
		return "名前:" + name + "  年齢:" + String.valueOf(age);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person Bob = new Person("Bob", 22) {
		};
		
		System.out.println(Bob.toString());

	}
}
