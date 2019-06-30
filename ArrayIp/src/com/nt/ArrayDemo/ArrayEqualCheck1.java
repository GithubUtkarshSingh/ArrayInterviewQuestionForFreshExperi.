package com.nt.ArrayDemo;

public class ArrayEqualCheck1
{
	public static void main(String[] args) 
	{
	int arr[]= {1,2,3,4,5};
	int arr1[]= {1,2,3,4,5};
	boolean equalOrNot=true;
	if(arr.length==arr.length)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=arr1[i])
			{
				equalOrNot=false;
			}
		}
	}
	else
	{
		equalOrNot=false;
	}
	if(equalOrNot)
	{
		System.out.println("Array or equal");
	}
	else
	{
		System.out.println("Array or not equal");
	}
	}
}