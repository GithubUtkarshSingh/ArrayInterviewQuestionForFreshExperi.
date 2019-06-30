package com.nt.ArrayDemo;
public class MergeArrayDemo
{
	public static void main(String[] args)
	{
	   int a[]= {10,20,30};
	   int b[]= {76,4,78,98};
	   int a_len=a.length;
	   int b_len=b.length;
	   int c_len=a.length+b.length;
	   int c[]=new int[c_len];
	   for(int i=0;i<a.length;i++)
	   {
		   c[i]=a[i];
	   }
	   for(int i=0;i<b.length;i++)
	   {
		   c[a.length+i]=b[i];
	   }
	   for(int i=0;i<c.length;i++)
	   {
		   System.out.print(c[i]+" ");
	   }
	}
}