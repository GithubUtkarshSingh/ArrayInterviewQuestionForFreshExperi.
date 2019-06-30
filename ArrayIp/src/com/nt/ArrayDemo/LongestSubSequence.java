package com.nt.ArrayDemo;
import java.util.HashSet;
import java.util.Set;
public class LongestSubSequence 
{
	public static void main(String[] args)
	{
		/*int arr[]= {1,2,88,90,3,5,44,56,66,23,38};*/
		int arr[]= {3,9,1,10,4,20,2};
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) 
		{
			set.add(arr[i]);			
		}
		int ln=0;
		for(int i=0;i<arr.length;i++)
		{
			if(!set.contains(arr[i]-1))
			{
				int no=arr[i];
			while(set.contains(no))
			{
				no++;
			}
			if(ln<no-arr[i])
			{
				ln=no-arr[i];
			}
		}
	}
		System.out.println(" Longest subsequence length "+ln);
}
}