package com.nt.ArrayDemo;

public class ReverseFirstHalf
{
	public static void main(String[] args)
	{
		int arr[]= {2,6,3,-5,2,1,8,5,-3};
		int temp=0;
		for(int i=0;i<arr.length/2;i++)
		{
		for(int j=i+1;j<=arr.length/2;j++)
		{
			if(arr[i]>arr[j])
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
