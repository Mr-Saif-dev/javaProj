package org.oar.carApp;
import java.util.Scanner;
public class Test 
{   //consumer or utilization logic
	public static void main(String[] args) 
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the name of car");
		String name=scr.next();
		scr.close();
		Iremote ir=CarFactory.getCar(name);
		if(ir!=null)
		{
			ir.start();
			ir.stop();
		}
	}

}
