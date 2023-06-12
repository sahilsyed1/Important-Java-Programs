package com.jsp.programs;
import java.util.*;
class Fabonac
{
	public void FirstFab(int n)
	{
		int a=0,b=1,c=0;
		for(int i=1; i<=n; i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}
	public void UpperLimitFab(int n)
	{
		int a=0,b=1,c=0;
		for(int i=1; i<=n; i++)
		{
			if(a>n)
			{
				break;
			}
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}
	public void RangeFab(int n, int m)
	{
		int a=0,b=1,c=0;
		for(int i=n; i<=m; i++)
		{
			if(a>=n)
			{
				System.out.print(a+" ");
			}
			c=a+b;
			a=b;
			b=c;
			if(a>m)
			{
				break;
			}
		}
	}
	public void Checkfabonacci(int n)
	{
		int a=0,b=1,c=0;
		for(int i=1; i<=n; i++)
		{
			c=a+b;
			if(c==n)
			{
				System.out.println(n+" Given Number is Fabonacci");
				break;
			}
			if(c>n)
			{
				System.out.println(n+" Given Number is Not a Fabonacci");
				break;
			}
			a=b;
			b=c;
		}
	}
}
public class Fabonacci 
{
	public static void main(String[] args)
	{
		System.out.println("Enter Num");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
		Fabonac f1 = new Fabonac();
		f1.RangeFab(n, m);
		
	}

}
