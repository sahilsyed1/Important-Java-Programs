package com.jsp.programs;
import java.util.*;

public class FindLargest 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Size");
		int n=scn.nextInt();
		int len=0,rem;
		while(n>0)
		{
			rem=n%10;
			if(rem>len)
			{
				len=rem;
			}
			n=n/10;
		}
		System.out.println(len);
	}
}
