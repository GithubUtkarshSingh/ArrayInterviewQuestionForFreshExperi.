package com.nt.ArrayDemo;
public class SecondSmallest
{
	public static void main(String[] args)
	{
		int arr[]= {33,45,29,67,-54,-45,32,44,};
		int demo=0;
		int small=0;
		int SmallOne=0;
		for(int i=0;i<arr.length;i++)
     	{
           if(arr[i]==SmallOne)
           {
        	   small=SmallOne;
           }
           else if(arr[i]<SmallOne)
           {
        	   SmallOne=small;
        	   small=arr[i];
           }
     }
		System.out.println("Second Smallest number is "+small);
	}
}