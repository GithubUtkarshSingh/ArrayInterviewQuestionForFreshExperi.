package com.nt.ArrayDemo;
interface lest
{
	default void m1()
	{
		System.out.println("Hello");
	}
}
interface right
{
	default void m1()
	{
		System.out.println("HelloMAm");
	}
}
public class Main implements lest,right
{
	public void m1()
	{
		lest.super.m1();
	}

	public static void main(String[] args)
	{
    Main m=new Main();
    m.m1();
	
	
	}

}
