package com.nt.ArrayDemo;

import java.util.HashSet;
import java.util.Set;

public class SetCommanArray
{
	public static void main(String[] args) 
	{
       int arr[]= {3,5,6,2,1,8,3,11,22,6,7,2};
       Set<Integer> set=new HashSet<Integer>();
       for (Integer no : arr)
       {
    	   if(set.add(no)==false)
    	   {
    		   System.out.print(no+" ");
    	   }
		
	}

	}

}
