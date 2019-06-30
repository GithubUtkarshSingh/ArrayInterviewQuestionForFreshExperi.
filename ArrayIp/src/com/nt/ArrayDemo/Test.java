package com.nt.ArrayDemo;

class Parent {
	  public  void methodOne() {
	   System.out.println("parent class");
	 }
	}
	class Child extends Parent{
	 public  void methodOne(){
	  System.out.println("child class");
	 }
	}
	class Test{
	 public static void main(String[] args)	{
			Parent p=new Parent();
			p.methodOne();//parent class
			Child c=new Child();
			c.methodOne();//child class
			Parent p1=new Child();
			p1.methodOne();//parent class
		}
	}