package com.nt.ArrayDemo;

public class SizeEqualDevide 
{
	public static void main(String[] args)
	{
		String str="DemoSess";
		m(str,4);
	}
	public static void m(String str, int i)
	{
		int size=str.length();
		int part;
		if(size%i!=0)
		{
			System.out.println("Number is not valid");
		}
		else
		{
			part=size/i;
			for(int j=0;j<size;i++)
			{
				System.out.print(str.charAt(i)+" ");
			}
		}	
	}
}