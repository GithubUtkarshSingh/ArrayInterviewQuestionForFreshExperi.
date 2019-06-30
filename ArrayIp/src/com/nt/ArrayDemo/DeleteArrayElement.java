package com.nt.ArrayDemo;
public class DeleteArrayElement
{
	public static void main(String[] args)
	{
		int arr[]= {3,4,22,5,6,7,8};
		int temp=7;
		for(int i=0;i<arr.length;i++)
		{
			if(temp==arr[i])
			{
				for(int j=i;j<arr.length;j++)
				{
				arr[i]=arr[i+1];
			}
			break;
		}
	}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
}
}