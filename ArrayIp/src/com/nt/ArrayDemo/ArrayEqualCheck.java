package com.nt.ArrayDemo;

public class ArrayEqualCheck {

	public static void main(String[] args) 
	{
	int arr[]= {1,2,3,4,5};
	int arr1[]= {2,1,3,5,4};
	int sum=0;
	int sum1=0;
	if(arr.length==arr1.length)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==arr1[i])
			{
		if(arr[i]==arr1[i])
		{
			sum+=arr.length;
			sum1+=arr1.length;
		}
			}
			else
			{
				System.out.println("Not order is same");
			}
		}
	}
	else
	{
		System.out.println("not equal");
	}

		System.out.println("Equal");
	System.out.println(sum+ " sum is "+sum1);
	}		
	}