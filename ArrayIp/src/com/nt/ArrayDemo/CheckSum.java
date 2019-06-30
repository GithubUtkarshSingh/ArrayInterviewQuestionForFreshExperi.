package com.nt.ArrayDemo;
public class CheckSum
{
	public static void main(String[] args) 
	{
		int sum=20;
		int arr[]= {2,4,10,10,2,15,5};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if((arr[i]+arr[j])==sum)
				{
					System.out.println(sum+" sum is equal to pair of array "+"("+arr[i]+","+arr[j]+")");
				}
			}
		}
	}
}