package com.sunbeam;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Account Number:");
		int accountNumber = sc.nextInt();
		
		System.out.println("Beginning Balance:");
		int beginningBalance = sc.nextInt();
		
		System.out.println("Total Charges:");
		int totalCharges = sc.nextInt();
		
		System.out.println("Total Credits:");
		int totalCredits = sc.nextInt();
		
		System.out.println(" Total Credit Limit:");
		int  totalCreditLimit = sc.nextInt();
		
		int newBalance = beginningBalance + totalCharges + totalCredits;
		System.out.printf("New Balance : ",newBalance);
		
		if(newBalance > totalCreditLimit)
		{
			System.out.println("Credit Limit Exceeded");
		}
		else
		{
			System.out.printf("Credit Limit Not Exceeded");
		}
		sc.close();
	}

}
