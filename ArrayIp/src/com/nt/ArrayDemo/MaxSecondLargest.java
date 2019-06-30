package com.nt.ArrayDemo;
public class MaxSecondLargest
{
	public static void main(String[] args)
	{
		int arr[]= {12,32,44,11,10,9,6,76,36,43};
		int large=0;
		int secondLarge=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>large)
			{
				secondLarge=large;
				large=arr[i];
			}
			else if(arr[i]>secondLarge)
			{
				secondLarge=arr[i];
			}
		}
		System.out.println("Larsge "+large);
		System.out.println("Second "+secondLarge);
	}
}