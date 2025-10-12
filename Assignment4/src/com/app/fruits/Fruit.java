package com.app.fruits;
public abstract class Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean isFresh;
    public abstract String taste();
    
    public Fruit ()
    {
    	System.out.println(" public Fruit ()");
    }
    public Fruit(String color, double weight, String name, boolean isFresh)
    {
    	this.color=color;
    	this.weight=weight;
    	this.name=name;
    	this.isFresh=isFresh;
    }
    public void setColor(String color)
    {
    	this.color=color;
    }
    public String getColor()
    {
    	return  color;
    }
    public void setWeight(double weight)
    {
    	this.weight=weight;
    }
    public double getWeight()
    {
    	return weight;
    }
    public void setName(String name)
    {
    	this.name=name;
    }
    public String getName()
    {
    	return name;
    }
    public void setIsFresh(boolean isFresh)
    {
    	this.isFresh= isFresh;
    }
    public boolean IsFresh()
    {
    	return isFresh; 
    }
    
}










