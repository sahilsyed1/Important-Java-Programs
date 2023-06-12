package com.jsp.programs;

class B
{
	static int rooms=100;
	static int acRooms=80;
	static int nonAcRooms=20;
	private static B t=null;
	private B()
	{
		int totalAc=rooms-nonAcRooms;
		System.out.println("Ac Rooms  = "+totalAc);
		int totalnon=rooms-acRooms;
		System.out.println("Non Ac Rooms = "+totalnon);
		
		
	}
	public static B getA()
	{
		if(t==null)
		{
			new B();
		}
		return t;
	}
}
class BookmyShow
{
	
}

public class SingleTonclass
{
	public static void main(String[] args) 
	{
		B.getA();

	}

}
