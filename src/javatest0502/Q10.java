package javatest0502;

import java.util.HashSet;

public class Q10 {

	public static void main(String[] args) {
		//1
		HashSet<String> dealedTask = new HashSet<>();
		dealedTask.add("TASK001");
		dealedTask.add("TASK002");
		dealedTask.add("TASK003");
		dealedTask.add("TASK001");
		dealedTask.add("TASK004");
		dealedTask.add("TASK002");
		
		//2
		System.out.println("処理済みのタスクID一覧");
		for(String task : dealedTask ) {
			System.out.println("-"+task);
		}
		
		//3
		String s = "TASK003";
		String t = "TASK005";
		if (dealedTask.contains(s)) {
			System.out.println("タスクID"+s+"は処理済みです");
		}else {
			System.out.println("タスクID"+s+"は未処理です");
		}
		if (dealedTask.contains(t)) {
			System.out.println("タスクID"+t+"は処理済みです");
		}else {
			System.out.println("タスクID"+t+"は未処理です");
		}
		
		//4
		int total=dealedTask.size();
		System.out.println("処理済みのタスクの総数:"+total);
	}

}
