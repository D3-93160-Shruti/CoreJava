

package com.app.fruits;

public class Orange extends Fruit 
{
	public Orange(String color, double weight, String name, boolean isFresh)
    {
    	super(name,weight,name,isFresh);
    }
	@Override
	public String taste()
	{
		return "Sour";
	}

}
