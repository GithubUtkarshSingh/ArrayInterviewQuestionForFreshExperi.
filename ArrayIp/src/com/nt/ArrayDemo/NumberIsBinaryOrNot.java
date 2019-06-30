package com.nt.ArrayDemo;

public class NumberIsBinaryOrNot {

	public static void main(String[] args)
	{
		System.out.println("Input the number");
		int num=new java.util.Scanner(System.in).nextInt();
		for(int i=0;i<num;i++)
		{
		if(num==0)
		{
			break;
		}
		else
		{
			
			int temp=num%10;
			if(temp>1)
			{
				System.out.println("The number is not binary");
			}
			else
			{
				num=num/10;
			}
		}
		// TODO Auto-generated method stub

	}
		System.out.println("The number is binary");

}
}