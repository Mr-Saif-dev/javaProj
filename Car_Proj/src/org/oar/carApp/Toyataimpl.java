package org.oar.carApp;
public class Toyataimpl implements Iremote
{
//implementation logic
	@Override
	public void start() 
	{
	  System.out.println("toyata starts");
	}

	@Override
	public void stop()
	{
	 System.out.println("toyata stops");
	}

}
