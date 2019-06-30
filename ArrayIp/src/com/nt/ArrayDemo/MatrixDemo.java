package com.nt.ArrayDemo;

import java.util.Scanner;

public class MatrixDemo
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Inpit the Matrix for Row");
		int row=scan.nextInt();
		System.out.println("Input the Coloumn");
		int col=scan.nextInt();
		int matrix[][]=new int[row][col];
		System.out.println("Enter Matrix Data");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
			   matrix[i][j]=scan.nextInt();
			}
		}
		System.out.println("Your Matrix is : ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
