package com.jsp.programs;
import java.util.*;

public class BinarytoDecimal 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Num");
		int n=scn.nextInt();
		int dec=0,i=1,r;
		while(n>0)
		{
			r=n%10;
			dec=dec+r*i;
			i=i*2;
			n=n/10;
		}
		System.out.println(dec);
	}

}
