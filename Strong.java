package com.jsp.programs;
import java.util.*;

public class Strong
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Num");
		int n=scn.nextInt();
		int m=n,sum=0,rem;
		while(n>0)
		{
			rem=n%10;
			int fact=1;
			for(int i=1; i<=rem; i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(sum==m)
		{
			System.out.println(m+"Strong");
		}
		else
		{
			System.out.println(m+"Not Strong");
		}
	}

}
