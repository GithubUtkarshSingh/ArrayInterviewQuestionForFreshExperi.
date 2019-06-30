package com.nt.ArrayDemo;

public class CommanElementinArray 
{
	public static void main(String[] args)
	{
		int arr[]= {2,4,5,3,8,77,66,99,-35,77,5};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i]+" ");
				}
			}
		}
		
	}

}
