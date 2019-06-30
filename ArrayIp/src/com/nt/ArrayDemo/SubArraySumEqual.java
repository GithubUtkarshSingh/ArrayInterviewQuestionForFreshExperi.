package com.nt.ArrayDemo;

import java.util.Arrays;

public class SubArraySumEqual 
{
	public static void main(String[] args) 
	{
       int arr[]={42, 15, 12, 8, 6, 32};
       int sum=26;
       int start=0;
       int sum1=arr[0];
       for(int i=0;i<arr.length;i++)
       {
    	   while(sum >sum && start <= i-1)
    	   {
    	   sum1=sum1-arr[start];
    	   start++;
    	   }
       if(sum==sum1)
       {
    	   System.out.println("Input Array : "+Arrays.toString(arr));
    	   System.out.println("Input number "+arr);
    	   System.out.println("Countinuous Sub Array");
       for (int j = start; j <= i; j++)
       {
           System.out.print(arr[j]+" ");
       }
       }
       }
	}
}