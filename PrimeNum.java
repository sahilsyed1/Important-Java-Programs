package com.jsp.programs;
import java.util.*;

public class PrimeNum {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Num");
		int n=scn.nextInt();
		int m=scn.nextInt();
//		int count=0;
		for(int i=n; i<=m; i++)
		{
			if(i<=1) continue;
			
			int count=0;
			for(int j=1; j<=i; i++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(i);
			}
		}
	}
}
