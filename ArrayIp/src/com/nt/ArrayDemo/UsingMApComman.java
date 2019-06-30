package com.nt.ArrayDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UsingMApComman
{
	public static void main(String[] args) 
	{
		int arr[]= {8,9,6,5,3,32,4,54,6,22,32,8,2,3,6,32,3};
		Map<Integer,Integer> map=new HashMap<>();
		for (int c : arr) 
		{
			if(map.get(c)!=null)
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c,1);
			}	
		}
		Set<Map.Entry<Integer,Integer>> set=map.entrySet();
		for (Entry<Integer, Integer> entry : set) 
		{
			if(entry.getValue()>1)
			{
				System.out.print(entry.getKey()+" ");
			}
			
		}
		/*Iterator<Integer> itr=map.keySet().iterator();
		while(itr.hasNext())
		{
		     Integer i=itr.next();
		     if(map.get(i)>1)
		     {
		    	System.out.println(i+" ......... "+map.get(i));
		     }
		}*/
		
	}
}