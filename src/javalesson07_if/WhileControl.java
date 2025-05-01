package javalesson07_if;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WhileControl {

	public static void main(String[] args) {
		int i, j, k;
		Scanner sc = new Scanner(System.in);
		// While Q1
		i = 0;
		j = 0;
		k = 1;
		while (i < 10) {
			i++;
			System.out.println(i);
		}
		//Q2
		int Sum = 0;
		while (j < 100) {

			j++;
			Sum += j;
		}
		System.out.println(Sum);
		//Q3
		Sum = 0;
		while (k != 0) {
			System.out.println("数字を入力してください（終了時は0）");
			k=Integer.parseInt(sc.nextLine());
			Sum += k;
		}
		System.out.println(Sum);
		// do-whileQ1
		i = 0;
		do {
			i++;
			System.out.println(i);
		} while (i < 10);

		//Q2
		j = 0;
		Sum = 0;
		do {
			j++;
			Sum += j;
		} while (j < 100);
		System.out.println(Sum);

		//Q3
		k = 0;
		
		Sum = 0;
		do {
			System.out.println("数字を入力してください（終了時は0）");
			k = Integer.parseInt(sc.nextLine());
			Sum += k;
		} while (k != 0);
		System.out.println(Sum);
		
		//ForQ1
		for (i = 1; i <= 10; i++) {
		    System.out.println(i);
		}
		//Q2
		Sum = 0;
		for (j = 1; j <= 100; j++) {
		    Sum += j;
		}//Q3
		System.out.println(Sum);
	    int f0=0;
	    int f1=1;
	    int f2 =2;
		for (k = 1; k <= 9; k++) {
			System.out.print(f0+",");
			f0=f1;
			f1=f2;
			f2=f0+f1;
		}
		System.out.println(f1);
		
		//Extend-ForQ1
		int[] root3 = {1,7,3,2};
		
		for(int X :root3) {
			System.out.print(X+",");
		}
		System.out.println("");
		
		//Q2
		ArrayList<String> Chemical = new ArrayList<>() ;
		Chemical.addAll(Arrays.asList("Water","CO2","iron","Carbon"));

		for(String X :Chemical) {
			System.out.print(X+",");
		}
		System.out.println("");
		
		//Q3
		sc.close();
	}

}
