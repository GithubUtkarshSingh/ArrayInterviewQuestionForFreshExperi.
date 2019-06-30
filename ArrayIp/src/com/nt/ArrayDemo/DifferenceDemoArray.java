package com.nt.ArrayDemo;

public class DifferenceDemoArray
{
	public static void main(String[] args)
	{
		int[] arr= {2,1,3,6,5,6};
		int num=1;
		for(int i=0;i<=arr.length;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]-arr[j]==num)
				{
					System.out.println("("+arr[i]+","+arr[j]+")"+" and difference is "+num);

				}
			}
		}

	}

}
