package com.nt.ArrayDemo;
public class LinearSearch
{
	public static void main(String[] args)
	{
		int x=200;
		int [] arr= {1,2,4,20,30,40};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				System.out.println("The item is found");
			    count+=1;
			}
		}
		if(count==0)
		{
			System.out.println("The item is not found");
		}
	}
}