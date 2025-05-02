package Teams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q7_main {
	public static void main(String[] args) {
		//要件データ
		ArrayList<Employee> employees = new ArrayList<Employee>(Arrays.asList(
				new Employee("山田太郎", "営業部", 300000, 5),
				new Employee("鈴木花子", "開発部", 350000, 3),
				new Employee("佐藤一郎", "営業部", 280000, 1),
				new Employee("田中美咲", "人事部", 320000, 4),
				new Employee("中村健一", "開発部", 380000, 7)));
		ArrayList<String> Departments = new ArrayList<>();

		//部署リスト
		for (Employee dlist : employees) {
			if (!Departments.contains(dlist.getDepartment())) {
				Departments.add(dlist.getDepartment());
			}
		}
		Scanner sc = new Scanner(System.in);
		String checkData = "";

		while (true) {
			System.out.println("部署ごとの平均給与を確認するときは1を");
			System.out.println("勤続年数に応じた昇給額を計算するときは2を");
			System.out.println("給料の高い順に3人表示するときは3を");
			System.out.println("終了するときはその他のキーを押してください");
			checkData = sc.nextLine();

			//部署ごとの平均給与
			if (checkData.equals("1")) {
				for (String a1 : Departments) {
					int total = 0;
					int person = 0;
					for (Employee a2 : employees) {
						if (a1 == a2.getDepartment()) {
							total += a2.getSalary();
							person++;
						}
						;
					}
					System.out.println(a1.toString() + "の平均給与は" + (double) total / person + "円です");
				}
				System.out.println();
				System.out.println();
			}

			//勤続年数に応じた昇給額を計算する
			else if (checkData.equals("2")) {
				/*for (Employee b : employees) {
					System.out.println(b.getName() + "さんの昇給額は" + b.getLengthasWorker() + "万円です");
					
					
				}*/Employee.addaYear(employees);
				System.out.println();
				System.out.println();
			}

			//給料の高い順に3人表示する機能
			else if (checkData.equals("3")) {
				Collections.sort(employees, new Employee.salaryComparator());
				for (int i = 0; i < 3; i++) {
					System.out.println(employees.get(i).getName());
				}
				System.out.println();
				System.out.println();
			}

			//終了
			else {
				break;
			}
		}
		sc.close();
	}
}
