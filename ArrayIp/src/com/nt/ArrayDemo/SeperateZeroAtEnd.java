package com.nt.ArrayDemo;
public class SeperateZeroAtEnd
{
	public static void main(String[] args) 
	{
	   int arr[]= {2,0,5,4,56,10,0,0,45,0,12,9};
	   int count=0;
	   for(int i=0;i<arr.length;i++)
	   {
		   if(arr[i]!=0)
		   {
			   arr[count]=arr[i];
			   count++;
		   }
	   }
	   while(count<arr.length)
	   {
		   arr[count]=0;
		   count++;
	   }
	   for (int i : arr)
	   {
		   System.out.print(i+" ");
	}
	}
}
	   /*int count=arr.length-1;
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
		
	}*/