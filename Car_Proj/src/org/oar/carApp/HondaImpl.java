package org.oar.carApp;
public class HondaImpl implements Iremote
{   //implementation logic
	@Override
	public void start() 
	{
	  System.out.println("honda starts");
	}

	@Override
	public void stop()
	{
	 System.out.println("honda stops");
	}
}
