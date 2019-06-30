package com.nt.ArrayDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class Demo
{
	public static void main(String[] args)
	{
		/*try
		{
			System.out.println(10/0);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("B");
		}
		catch(Exception e)
		{
			System.out.println("A");
		}
		finally
		{
			System.out.println("C");
		}*/
		Set<Integer> set=new HashSet<Integer>();
		set.add(50);
		set.add(30);
		set.add(22);
		ListIterator<Integer>itr=(ListIterator<Integer>) set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.remove());
		}
		/*Iterator<Integer> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}*/
		/*int[] arr= {32,89,76,32,22,5,4};
		System.out.println("Maximum Value is: "+Maxm(arr));
		System.out.println("Minimum Value is: "+Minm(arr));
	}

	public static int Maxm(int[] arr)
	{
		int Max=arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>Max)
			{
				Max=arr[i];
			}
		}
		
		return Max;
	}
	public static int Minm(int[] arr) 
	{
		int Min=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]<Min)
			{
				Min=arr[i];
			}
		}
		return Min;
	*/
		
	
	}

}
