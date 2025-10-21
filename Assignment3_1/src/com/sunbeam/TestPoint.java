package com.sunbeam;

import java.util.Scanner;

public class TestPoint
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//point1
		System.out.println("Enter the Coordinate x and y for point1:");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		//point2
		System.out.println("Enter the Coordinate x and y for point2:");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		//object p1 and p2
		Point2D p1 = new Point2D(x1,y1);
		Point2D p2 = new Point2D(x2,y2);
		
		//Display details
		System.out.println("Point1:" + p1.getDetails());
		System.out.println("Point2:" + p2.getDetails());
		
		//compare
		if(p1.isEqual(p2))
		{
			System.out.println("Both the points are same");
		}
		else
		{
			System.out.printf("Points are Different. Distance between them:%.2f\n", p1.calculateDistance(p2));
		}
		
		sc.close();
	}

}
