package com.sunbeam;
import java.util.Scanner;
public class DateTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Day:");
		int day = sc.nextInt();
		System.out.println("Enter the month:");
		int month = sc.nextInt();
		System.out.println("Enter the year:");
		int year = sc.nextInt();
		
		Date d1 = new Date(day, month, year);
		d1.displayDate();
	}

}
