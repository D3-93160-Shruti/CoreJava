package com.subeam;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String str = sc.nextLine();
		str = str.trim(); //remove the space 
		String[] words = str.split("\\s+");//split the string by one or more spaces
		int wordcount = (str.isEmpty()?0:words.length);
		System.out.println("Number of words in the String:"+wordcount);
		sc.close();
	}

}
