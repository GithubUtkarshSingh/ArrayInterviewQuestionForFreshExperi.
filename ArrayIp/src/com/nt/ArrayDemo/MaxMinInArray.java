package com.nt.ArrayDemo;

public class MaxMinInArray 
{
	public static void main(String[] args)
	{
		int arr[]= {65,34,22,66,11,98,45};
		System.out.println("Maximum value is "+Max(arr));
		System.out.println("Minimum value is "+Min(arr));
	}
	public static int Max(int[] arr) 
	{
		int MaxVal=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>MaxVal)
			{
				MaxVal=arr[i];
			}
		}
		return MaxVal;
	}
     public static int Min(int[] arr) 
     {
    	 int MinVal=arr[0];
    	 for(int i=0;i<arr.length;i++)
    	 {
    		 if(arr[i]<MinVal)
    		 {
    			 MinVal=arr[i];
    		 }
    	 }
    	return MinVal;
	}
}