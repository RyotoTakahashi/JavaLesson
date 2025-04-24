package javalesson07_if;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountryCapital {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Map<String, String> Country = new HashMap<>();

		Country.put("日本", "東京");
		Country.put("アメリカ合衆国", "ワシントンD.C.");
		Country.put("フランス", "パリ");
		Country.put("中国", "北京");

		Set<String> countryList = Country.keySet();

		String ALLCountry = "すべての国名と首都";
		String SunCountry = "「日」を含む国とその首都";

		for (String Countries : countryList) {
			String Capitals = Country.get(Countries);
			ALLCountry += "「国名：" + Countries + "　首都：" + Capitals + "」";
		}
		System.out.println(ALLCountry);

		int i = 0;
		for (String Countries : countryList) {
			String Capitals = Country.get(Countries);
			if (Countries.contains("日")) {
				i++;
				SunCountry += "「国名：" + Countries + "　首都：" + Capitals + "」";
			}
		}
		if (i == 0) {
			SunCountry += "　該当なし";
		}
		System.out.println(SunCountry);
	}

}
