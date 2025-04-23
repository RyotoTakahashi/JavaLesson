package jp.co.aforce.sample;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    	LocalDate today = LocalDate.of(2024, 4, 14);
    	LocalDate nextWeek = today.plusDays(7);
    	System.out.println(nextWeek);


    }
}
