package com.nt.ArrayDemo;
public class Equal
{
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,6};
		int arr1[]= {1,3,6,2,4};
		boolean equalorNot=true;
		if(arr.length==arr1.length)
		{
			System.out.println("Array Length is Same");
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]!=arr1[i])
		    {
		    	equalorNot=false;
		    	
		    }
		}
		}
		else
		{
			equalorNot=false;
		}
		if(equalorNot)
		{
			System.out.println("Two Array are equal");
		}
		else
		{
			System.out.println("Two array are not equal");
		}
	}
}