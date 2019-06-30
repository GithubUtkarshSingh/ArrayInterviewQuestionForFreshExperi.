package com.nt.ArrayDemo;
public class ConvertDemo 
{
	    public static void main(String[] args) 
	    {
	        int count = 0, a;
	        String x = "";
	        System.out.print("Enter any decimal number:");
	        int n=new java.util.Scanner(System.in).nextInt();
	        while(n > 0)
	        {
	            a = n % 2;
	            if(a == 1)
	            {
	                count++;
	            }
	            x = x + "" + a;
	            n = n / 2;
	        }
	        System.out.println("Binary number:"+x);
	        System.out.println("No. of 1s: "+count);
	    }
	}