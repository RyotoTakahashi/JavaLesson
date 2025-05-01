package Teams;

import java.util.HashMap;
import java.util.Scanner;

public class Q6_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String importcity = "";

		//初期条件の代入(東京、大阪、京都、福岡、札幌) 
		//keyは都市名,valueはtouristData
		//touristData.javaを参照のこと
		HashMap<String, touristData> City = new HashMap<>();
		City.put("東京", new touristData(1500000, 2500000));
		City.put("大阪", new touristData(1200000, 1800000));
		City.put("京都", new touristData(800000, 1200000));
		City.put("福岡", new touristData(500000, 800000));
		City.put("札幌", new touristData(400000, 600000));

		//1全体の構文,0入力時終了
		while (!importcity.equals("0")) {

			System.out.println("統計の確認をする場合は1,都市のデータ登録、変更をする場合は2を、終了時は0を入力してください");
			String check = sc.nextLine();

			//1-0.whileを脱出
			if (check.equals("0")) {
				break;
			}

			//1-1.統計確認
			else if (check.equals("1")) {
				System.out.println("総観光客数を計算する場合は1,観光客が100万人を超える都市を検索する場合は2を、");
				System.out.println("外国人観光客の割合が最も高い都市を検索する場合は3を、最初に戻るには0を入力してください");
				String dataCheck = sc.nextLine();

				//1-1-0.脱出、1-1統計確認へ
				if (dataCheck.equals("0")) {
					break;
				}

				//1-1-1.総旅行客数を計算
				else if (dataCheck.equals("1")) {
					int total = 0;
					for (String key : City.keySet()) {
						total += City.get(key).getTotalTourist();
					}
					System.out.println(total);
				}

				//1-1-2.100万人以上の都市を表示
				else if (dataCheck.equals("2")) {
					for (String key : City.keySet()) {
						if (City.get(key).getTotalTourist() >= 1000000) {
							System.out.println(key);

						}
					}
				}

				//1-1-3.外国人の割合が最も高い都市を表示
				else if (dataCheck.equals("3")) {
					int percentage = 0;
					String Cityname = "";
					for (String key : City.keySet()) {
						if (City.get(key).getForeignTourist() >= percentage) {
							Cityname = key;
							percentage = City.get(key).getForeignTourist();
						}

					}
					System.out.println(Cityname);
				}
			}

			//1-2都市の追加
			else if (check.equals("2")) {
				System.out.println("都市名を入力してください。");
				importcity = sc.nextLine();

				//keyが存在しなければ新規作成
				if (City.get(importcity) == null) {
					boolean Flag = true;//常にtrue
					int newDomestic = 0;
					int newForeigner = 0;

					//国内観光客数の入力
					while (Flag) {
						System.out.println("国内観光客数を入力してください。");
						newDomestic = Integer.parseInt(sc.nextLine());

						//0以上で脱出
						if (newDomestic > 0) {
							break;
						}
					}

					//外国人観光客数の入力
					while (Flag) {
						System.out.println("外国人観光客数を入力してください。");
						newForeigner = Integer.parseInt(sc.nextLine());

						//0以上で脱出
						if (newDomestic > 0) {
							break;
						}

					}
					touristData newCity = new touristData(newDomestic, newForeigner);
					City.put(importcity, newCity);
				}
			}

			else {//値がある場合→更新の場合
				int Domestic;
				int Foreigner;

				//国内観光客数の入力
				System.out.println("国内観光客数を入力してください。");
				Domestic = Integer.parseInt(sc.nextLine());

				//0より大きいなら設定
				if (Domestic > 0) {
					City.get(importcity).setDomesticTourist(Domestic);
				}

				//外国人観光客数の入力
				System.out.println("外国人観光客数を入力してください。");
				Foreigner = Integer.parseInt(sc.nextLine());
				
				//0より大きいなら設定
				if (Foreigner > 0) {
					City.get(importcity).setForeignTourist(Foreigner);
				}

			}

			continue;//最初に戻る
		}//全体終了
		sc.close();
	}

}
