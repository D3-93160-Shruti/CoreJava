package com.sunbeam;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.next();
		str = str.replace("\\s+", "").toLowerCase();//remove spaces and convert to lowercase
		String reversed = new StringBuilder(str).reverse().toString();
		if(str.equals(reversed))
		{
			System.out.println("The String is plaindrom");
		}
		else
		{
			System.out.println("The String is not Palindrome");
		}
		sc.close();
	}

}
