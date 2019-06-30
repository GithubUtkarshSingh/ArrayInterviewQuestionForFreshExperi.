package com.nt.ArrayDemo;

import java.util.HashSet;
import java.util.Set;

public class InterSectionArray
{
	public static void main(String[] args) 
	{
		String arr[]= {"String","One","Two","Three","Four","Five","Six"};
		String arr1[]={"String","Onee","Twou","Threi","Fourop","Five","Six"};
		Set<String> set=new HashSet<String>();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				if(arr[i].equals(arr1[j]))
				{
				  set.add(arr[i]);
				  }
			}
		}
	/*for (String string : set)
	{
		System.out.print(string+" ");
		
	}*/
		System.out.print(set+" ");
	}
}
