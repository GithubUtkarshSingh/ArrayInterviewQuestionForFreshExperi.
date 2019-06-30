package com.nt.ArrayDemo;

public class TwoArrayComman
{
	public static void main(String[] args) 
	{
	int arr[]= {2,8,10,43,87,42};
	int arr1[]= {10,82,67,33,43,78};
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr1.length;j++)
		{
			if(arr[i]==arr1[j])
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
	}

}
