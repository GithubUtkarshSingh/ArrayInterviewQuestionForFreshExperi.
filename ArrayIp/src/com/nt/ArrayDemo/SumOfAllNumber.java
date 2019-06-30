package com.nt.ArrayDemo;
public class SumOfAllNumber
{
	public static void main(String[] args) 
	{
		int sum=0;
		int num=3546;
		int x;
		while(num>0)
		{
		x=num%10;
		sum=sum+x;
		num=num/10;
		}
		System.out.println(sum+" is Sum of given number");
	}
}