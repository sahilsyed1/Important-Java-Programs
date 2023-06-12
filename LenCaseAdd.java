package com.jsp.programs;

public class LenCaseAdd {

	public static void main(String[] args) {
		int a=1, b=143, n;
		int count=0;
		for(int i=a; i<=b; i++)
		{
			int c=0;
			n=i;
			while(n>0) 
			{
				c++;
				n=n/10;
			}
			if(c==1) count++;
			else if(c==2) count+=2;
			else count+=3;
		}
		System.out.println(count);
	}

}
