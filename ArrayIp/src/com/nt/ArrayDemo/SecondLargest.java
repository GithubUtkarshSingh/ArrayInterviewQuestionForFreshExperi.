package com.nt.ArrayDemo;

public class SecondLargest {

	public static void main(String[] args)
	{
		int arr[]= {3,4,2,67,45,98,89,44,54,20};
		int first=0;
		int Second=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>first)
			{
				Second=first;
				first=arr[i];
			}
			else if(arr[i]<first && arr[i]>Second)
			{
				Second=arr[i];
			}
		}
		System.out.println("Second Largest number is "+Second);
		/*for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]>first)
		    {
		    	Second=first;
		    	first=arr[i];
		    }
		    else if(arr[i]>Second)
		    {
		    	Second=arr[i];
		    }
		}
		System.out.println("Large First is: "+first);
		System.out.println("SecondLargest is: "+Second);*/
	}

}
