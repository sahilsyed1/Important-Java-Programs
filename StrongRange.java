package com.jsp.programs;
import java.util.*;

public class StrongRange 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Range");
		int a=scn.nextInt();
		int b=scn.nextInt();
		for(int i=a; i<=b; i++)
		{
			int sum=0,rem,n=i;
			while(n>0)
			{
				rem=n%10;
				int fact=1;
				for(int j=1; j<=rem; j++)
				{
					fact=fact*j;
				}
				sum=sum+fact;
				n=n/10;
			}
			if(sum==i)
			{
				System.out.print(i+" ");
			}
		}

	}

}
