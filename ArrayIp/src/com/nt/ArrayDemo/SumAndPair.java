package com.nt.ArrayDemo;
public class SumAndPair 
{
	public static void main(String[] args)
	{
		
		findThePair(new int[] {20,30,50,10,80,60,20},80);
		/*int sum=80;
		int arr[]= {20,30,50,10,80,60,20};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==sum)
				{
					System.out.println(arr[i]+" + "+arr[j]+" = "+sum);
				}
			}
		}
		// TODO Auto-generated method stub
*/
	}

	public static void findThePair(int[] arr, int sum)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==sum)
				{
					System.out.println(arr[i]+" + "+arr[j]+" = "+sum);
				}
			}
		}
		
	}

}
