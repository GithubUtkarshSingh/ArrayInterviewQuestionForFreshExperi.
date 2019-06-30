package com.nt.ArrayDemo;
abstract class name1
{
	abstract public void m1();
name1()
{
	System.out.println("Hello");
}
}
/*interface name
{
	public void m1();
}*/
public class MissingNumber extends name1 
{
	@Override
	public void m1()
	{
		System.out.println("abstract is inherit");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args)
	{
		MissingNumber n=new MissingNumber();
		n.m1();
		
		/*
		int arr[]= {6,5,4,1,2,7};
		System.out.println(m1(arr));
		int arr1[]= {25,26,28};
		System.out.println(m1(arr1));
	}

	public static int m1(int[] arr)
	{
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		int resetSum=0;
		for(int i=0;i<arr.length;i++)
		{
			resetSum+=arr[i];
		}
		int missingNumber=sum-resetSum;
		
		return missingNumber;
	}
*/
	}

}
