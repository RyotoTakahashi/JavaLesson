package javalesson10static;

public class Player {
	//HPのフィールドを定義
	int hp = 100;
	
	public static void main(String args[]) {
		Player p1 = new Player();
		Player p2 = new Player();
		
		System.out.println("初期状態");
		System.out.println("p1.hp="+p1.hp);
		System.out.println("p2.hp="+p2.hp);
		
		p1.hp-=30;
		
		System.out.println("ダメージ後");
		System.out.println("p1.hp="+p1.hp);
		System.out.println("p2.hp="+p2.hp);
		
	}

}
