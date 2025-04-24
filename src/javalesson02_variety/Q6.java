package javalesson02_variety;

public class Q6 {

	public static void main(String[] args) {
		String name = "髙橋 嶺斗";
		int age = 22;
		int birthyear = 2003;
		int birthmonth = 2;
		int birthday = 6;
		String sentence = String.format("名前:%s, 年齢: %d歳, 誕生日: %d.%d.%d",name,age,birthyear,birthmonth,birthday);
		System.out.println(sentence);
	}

}
