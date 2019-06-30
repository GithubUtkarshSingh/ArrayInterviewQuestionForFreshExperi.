package com.nt.ArrayDemo;
public class MiddleIndexSUm
{
	public static void main(String[] args)
	{
		MiddleIndexSUm d=new MiddleIndexSUm();
		int arr[]= {1,2,3,4,5,2};
		int arr_size=arr.length;
		System.out.println(d.Test(arr,arr_size));
}
	public int Test(int[] arr, int n) 
	{
		int leftSum,rightSum;
		for(int i=0;i<n;i++)
		{
			leftSum=0;
			for(int j=0;j<i;j++)
				leftSum+=arr[j];
				rightSum=0;
				for(int j=i+1;j<n;j++)
				if(leftSum==rightSum)
				return i;
			}
		return -1;
		}
	}