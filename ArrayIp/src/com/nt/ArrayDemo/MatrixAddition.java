package com.nt.ArrayDemo;

import java.util.Scanner;

public class MatrixAddition
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the row");
		int row=new java.util.Scanner(System.in).nextInt();
		System.out.println("Enter the column");
		int col=new java.util.Scanner(System.in).nextInt();
		int[][] matrix=new int[row][col];
		int[][] matrix1=new int[row][col];
		int[][]sum=new int[row][col];
		System.out.println("Input the first matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrix[i][j]=new java.util.Scanner(System.in).nextInt();
			}
		}
		System.out.println("Input the second matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrix1[i][j]=new java.util.Scanner(System.in).nextInt();
			}
		}
		System.out.println("First Matrix Output");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(matrix1[i][j]+"\t");
			}
		}
		System.out.println("Sum of the matrix is :");
		
				
	}
}