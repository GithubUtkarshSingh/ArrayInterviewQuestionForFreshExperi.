package com.nt.ArrayDemo;

public class BruteForceArraySort 
{
	public static void main(String[] args) 
	{
		int arr[]= {2,3,4,5,11,55,32,98,3,11,567,55,-43};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && (i!=j))
				{
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
}