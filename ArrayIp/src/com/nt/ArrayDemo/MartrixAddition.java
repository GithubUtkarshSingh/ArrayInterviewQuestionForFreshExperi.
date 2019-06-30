package com.nt.ArrayDemo;
public class MartrixAddition
{
	public static void main(String[] args) 
	{
		System.out.println("Input the Row Matrix");
		int row=new java.util.Scanner(System.in).nextInt();
		System.out.println("Input the Column Matrix");
		int column=new java.util.Scanner(System.in).nextInt();
		int[][] matrix1=new int[row][column];
		int[][] matrix2=new int[row][column];
		int[][] sum=new int[row][column];
		System.out.println("Enter the specific data");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				matrix1[i][j]=new java.util.Scanner(System.in).nextInt();
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				matrix2[i][j]=new java.util.Scanner(System.in).nextInt();
			}
		}
		System.out.println("First Matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(matrix1[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Second Matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(matrix2[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Sum of all Matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				sum[i][j]=matrix1[i][j]+matrix2[i][j];
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}	
	}
}