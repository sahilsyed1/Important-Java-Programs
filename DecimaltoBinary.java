package com.jsp.programs;
import java.util.*;

public class DecimaltoBinary 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Num");
		int n=scn.nextInt();
		int bin=0;
		int i=1;
		int r;
		while(n>0)
		{
			r=n%2;
			bin=bin+r*i;
			i=i*10;
			n=n/2;
		}
		System.out.println(bin);
	}

}
