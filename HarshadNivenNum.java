package com.jsp.programs;
import java.util.*;

public class HarshadNivenNum 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Num");
		int n=scn.nextInt();
		int m=n;
		int sum=0,rem;
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		if(m%sum==0)
		{
			System.out.println("Niven");
		}
		else
		{
			System.out.println("Not a Niven");
		}
	}
}
