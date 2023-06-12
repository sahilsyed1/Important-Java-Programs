package com.jsp.programs;
import java.util.*;

public class AutomorphicNum 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Num");
		int n=scn.nextInt();
		int q=n*n;
		int d,d1;
		int flag=0;
		while(n>0)
		{
			d=n%10; d1=q%10;
			if(d!=d1)
			{
				flag=1;
			}
			n=n/10; q=q/10;
		}
		if(flag==0)
		{
			System.out.println("Automorphic");
		}
		else
		{
			System.out.println("Not Automorphic");
		}
	}
}
