package javaAdvance.javalesson11;

import org.apache.commons.lang3.StringUtils;

public class Langs {
	public static void main(String[] args) {
	int t =StringUtils.compare(null, null);
	System.out.println(t);
	String reversed = StringUtils.reverse("example");
	System.out.println(reversed);
	}
}
