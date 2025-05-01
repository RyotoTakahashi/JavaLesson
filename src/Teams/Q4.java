package Teams;

import java.util.ArrayList;
import java.util.Arrays;

public class Q4 {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>() ;
		fruits.addAll(Arrays.asList("りんご","みかん","ぶどう"));

		for(String X :fruits) {
			System.out.print(X+",");
		}
		System.out.println("");

	}

}
