package com.jsp.programs;
import java.util.*;

public class MagicNum 
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Num");
		int n=scn.nextInt();
		int temp=n;
		int sum=0,rem;
		while(temp>9)
		{
			sum=0;
			while(temp>0)
			{
				rem=temp%10;
				sum=sum+rem;
				temp=temp/10;
			}
			temp=sum;
		}
		if(sum==1)
		{
			System.out.println("Magic");
		}
		else
		{
			System.out.println("Not a Magic");
		}
	}
}
