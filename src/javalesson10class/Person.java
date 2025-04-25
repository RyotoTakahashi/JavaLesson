package javalesson10class;

public class Person {
	//
	String name;
	int age;
	
	//コンストラクタ
	Person(String N, int A){
		this.name = N;
		this.age = A;
	}
	
	public void showPerson(){
		System.out.println("私は"+name+"です。年齢は"+age+"才です。");
	}
	public static void main(String args[]) {
		Person john = new Person("john",25);
		john.showPerson();
	}
}
