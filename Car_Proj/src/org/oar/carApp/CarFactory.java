package org.oar.carApp;
public class CarFactory 
{
	//object creation logic
    public static Iremote getCar(String type)
    {   
    	if(type.equalsIgnoreCase("toyata"))
    		return new Toyataimpl();
    	else if(type.equalsIgnoreCase("honda"))
    		return new HondaImpl();
    	else 
    		System.err.println("wrong choice of car");
    	return null;
    }
}
