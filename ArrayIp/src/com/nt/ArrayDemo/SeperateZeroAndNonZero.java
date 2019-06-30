package com.nt.ArrayDemo;
public class SeperateZeroAndNonZero
{
	public static void main(String[] args) 
	{
		int arr[]= {2,0,0,9,43,56,89,45};
	   int count=arr.length-1;
	   for(int i=arr.length-1;i>=0;i--)
	   {
		   if(arr[i]!=0)
		   {
			   arr[count]=arr[i];
			   count--;
		   }
	   }
	   while(count>=0)
	   {
		   arr[count]=0;
		   count--;
	   }
	   for (int i : arr) 
	   {
		   System.out.print(i+" ");
		
	}
	}
}