package com.nt.ArrayDemo;
public class SelectionSort 
{
	public static void main(String[] args) 
	{
       int arr[]= {45,65,22,11,9,89,5,8,5};
       int min;
       int temp;
       for(int i=0;i<arr.length;i++)
       {
    	   min=i;
    	   for(int j=i+1;j<arr.length;j++)
    	   {
    		   if(arr[min]>arr[j])
    		   {
    			   min=j;
    		   }
    	   }
    	   temp=arr[i];
    	   arr[i]=arr[min];
    	   arr[min]=temp;
       }
       for(int i=0;i<arr.length;i++)
       {
    	   System.out.print(arr[i]+" ");
       }
	}
}
		/*
	}
		int arr[]= {67,98,9,34,6,87};
		int min;
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[min]>arr[j])
				{
					min=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
*/