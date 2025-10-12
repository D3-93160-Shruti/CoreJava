package com.sunbeam;

public class Date {
	private int day;
	private int month;
	private int year;
	//constructor
	public Date(int day, int month, int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	//getter setter
	public void setDay(int day)
	{
		this.day=day;
	}
	public int getDay()
	{
		return day;
	}
	public void setmonth(int month)
	{
		this.month=month;
	}
	public int getmonth()
	{
		return month;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public int getyear()
	{
		return year;
	}
	//
	public void displayDate()
	{
		System.out.printf("%d/%d/%d",day,month,year);
	}
}
