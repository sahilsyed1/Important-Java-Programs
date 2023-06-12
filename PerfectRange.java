package com.jsp.programs;
import java.util.*;

public class PerfectRange 
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Range");
		int n=scn.nextInt();
		int m=scn.nextInt();
		for(int i=n; i<=m; i++)
		{
			int sum=0;
			for(int j=1; j<i; j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
			if(sum==i)
			{
				System.out.print(sum+" ");
			}
		}
	}
}
