package com.sunbeam;

import java.util.Scanner;

class ExceptionLineTooLong extends Exception {

	public ExceptionLineTooLong(String message) {
		super(message);
	}
}
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		try
		{
			if(str.length()>80)
			throw new ExceptionLineTooLong("The String is too long");
			else
			{
				 System.out.println("String accepted. Length = " + str.length());
			}
		}
		catch(ExceptionLineTooLong e)
		{
			System.out.println("Error : "+e.getMessage());
		}
		sc.close();
	}

}
