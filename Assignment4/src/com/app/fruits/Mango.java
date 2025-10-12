package com.app.fruits;

public class Mango extends Fruit
{
	public Mango(String color, double weight, String name, boolean isFresh)
    {
    	super(name,weight,name,isFresh);
    }
	@Override
	public String taste()
	{
		return "Sweet";
	}

}
