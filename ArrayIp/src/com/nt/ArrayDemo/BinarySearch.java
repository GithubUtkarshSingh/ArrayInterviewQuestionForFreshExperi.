package com.nt.ArrayDemo;
public class BinarySearch
{
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,6,10,32,20,89,44};
		int search=10;
		int li=0;
		int hi=arr.length-1;
		int mi=(li+hi)/2;
		while(li<=hi)
		{
			if(arr[mi]==search)
			{
				System.out.println("The element is found "+arr[mi]+" at index "+mi);
			break;
			}
			else if(arr[mi]<search)
			{
			li=mi+1;
			}
			else
			{
				hi=mi-1;
			}
			mi=(li+hi)/2;
		}
		if(li>hi)
		{
			System.out.println("Element is not found");
		}
	}
}