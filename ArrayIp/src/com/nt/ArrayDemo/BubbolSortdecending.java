package com.nt.ArrayDemo;

public class BubbolSortdecending 
{
	public static void main(String[] args)
	{
		int arr[]= {2,7,9,12,4,5,-8};
		int temp=0;
		for(int i=0;i<=arr.length;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int i : arr) 
		{
			System.out.print(i+" ");
			
		}
	}
}