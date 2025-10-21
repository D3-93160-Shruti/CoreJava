package com.sunbeam;

public class Point2D {
	private double x;
	private double y;
	//constructor
	public Point2D(double x, double y)
	{
		this.x=x;
		this.y=y;
	}
	//isEqual method
	public boolean isEqual(Point2D otherpoint)
	{
		return this.x==otherpoint.x && this.y==otherpoint.y;
	}
	
	//method
	public String getDetails() {
		return "("+x+","+y+")";
	}
	//calculating distance
	public double calculateDistance(Point2D otherPoint)
	{
		double dx = this.x-otherPoint.x;
		double dy = this.y-otherPoint.y;
		return Math.sqrt(Math.pow(dx, 2) +Math.pow(dy,2));
	}
}
