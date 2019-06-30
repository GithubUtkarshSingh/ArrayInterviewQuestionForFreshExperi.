package com.nt.ArrayDemo;

import java.util.Arrays;
import java.util.Scanner;

public class UserInput
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String st=scan.nextLine();
		/*for(int i=0;i<args.length;i++)
		{
			args[i]=args[i]+1;
			
		}
		System.out.println(Arrays.toString(args));*/
		String st1[]=st.split(" ");
		int a=Integer.parseInt(st1[0]);
		int b=Integer.parseInt(st1[1]);
		int c=Integer.parseInt(st1[2]);
		int s=a+b+c;
		System.out.println(s+" =sum");
  
	}

}
