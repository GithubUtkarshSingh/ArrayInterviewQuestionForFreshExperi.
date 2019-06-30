package com.nt.ArrayDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*class Test
{
	public static void m1()
	{
		System.out.println("Hello");
	}
}*/
public class Demow 
{
	public static void main(String args[])
	{
		/*try
		{
			System.out.println("Hello");
			return;
		}
		catch(Exception e)
		{
			System.out.println("Demo");
		}
		finally
		{
			System.out.println("Fekfhf");
		}*/
		String s=new String("Hello");
		String s1="Demo";
		String s2=s.concat(s1);
		System.out.println(s2+" ");
		System.out.println(s+" ");
		System.out.println(s1+" ");
		
		/*String s="Hello";
		s="123";
		System.out.println(s+" ");*/
		/*HashMap<String,Integer> map=new HashMap<>();
		map.put("Ramu",1);
		map.put("Abhi",89);
		map.put("Sda",5);
		map.put("uhyjd",34);
		map.put("Xas",98);
		map.put("Bybc",3);
		System.out.println(map+" ");*/
		/*Set<Integer> set=new HashSet<Integer>();
		set.add(23);
		set.add(45);
		set.add(54);
		set.add(4);
		set.add(5);
		set.add(95);
		set.add(7);
		set.add(8);
		set.add(9);
		set.add(23);
		set.add(54);
		System.out.println(set+" ");*/
		/*ArrayList<Integer> li=new ArrayList<>();
		li.add(34);
		li.add(76);
		li.add(43);
		li.add(54);
		li.add(76);
		li.add(44);
		li.add(23);
		li.add(87);
		li.add(12);
		System.out.println(li+" ");*/
		
		
		
		
	}
}















/*interface A
{
	default void m1()
	{
		System.out.println("Hello");
	}
	public void m1();
}
interface B
{
	public void m1();
	default void m1()
	{
		System.out.println("Hello1");
	}
}
public class Demow implements A,B
{
	
	public void m1()
	{
		A.super.m1();
	}
	public static void main(String args[])
	{
		Demow d=new Demow();
		d.m1();
	} 
	@Override
	public void m1() 
	{
		
	}
}*/





/*class Tes implements Runnable { 
public
    void run() 
    { 
        System.out.println("Run"); 
    } 
} class Demow { 
public
    static void main(String[] args) 
    { 
	
        Thread t1 = new Thread(); 
        t1.start(); 
        System.out.println("Main"); 
    } 
} 
*/



/*extends Thread { 
public
    void run() 
    { 
        System.out.println("Run"); 
    } 
} class Demow { 
public
    static void main(String[] args) 
    { 
        Tes t = new Tes(); 
      // t.run();
         t.start();
         System.out.println("Main"); 
    } 
} */
/*class Demow
{   int count = 0;
 
    void A() throws Exception
    {
        try
        {
            count++;
             
            try
            {
                count++;
 
                try
                {
                    count++;
                    throw new Exception();
 
                }
                 
                catch(Exception ex)
                {
                    count++;
                    throw new Exception();
                }
            }
             
            catch(Exception ex)
            {
                count++;
            }
        }
         
        catch(Exception ex)
        {
            count++;
        }
 
    }
 
    void display()
    {
        System.out.println(count);
    }
 
    public static void main(String[] args) throws Exception
    {
    	Demow obj = new Demow();
        obj.A();
        obj.display();
    }
}*/






























/*class Demow
{
    String str = "a";
 
    void A()
    {
        try
        {
            str +="b";
            B();
        }
        catch (Exception e)
        {
            str += "c";
        }
    }
 
    void B() throws Exception
    {
        try
        {
            str += "d";
            C();
        }
        catch(Exception e)
        {
            throw new Exception();
        }
        finally
        {
            str += "e";
        }
 
        str += "f";
 
    }
     
    void C() throws Exception
    {
        throw new Exception();
    }
 
    void display()
    {
        System.out.println(str);
    }
 
    public static void main(String[] args)
    {
        Demow object = new Demow();
        object.A();
        object.display();
    }
 
}*/































/*public class Demow 
{
	  public static void main(String args[])
	  {


try
{
    int a[]= {1, 2, 3, 4};
    for (int i = 1; i <= 4; i++)
    {
        System.out.println ("a[" + i + "]=" + a[i] + "n");
    }
}
 */
/*catch (Exception e)
{
    System.out.println ("error = " + e);
}*/
 
/*catch (ArrayIndexOutOfBoundsException e)
{
    System.out.println ("ArrayIndexOutOfBoundsException");
}
	  }
}*/



/*class Base extends Exception {}
class Derived extends Base  {}
 
public class Demow {
  public static void main(String args[]) {
   // some other stuff
   try {
       // Some monitored code
       throw new Derived();
    }
    catch(Base b)     { 
       System.out.println("Caught base class exception"); 
    }
    catch(Derived d)  { 
       System.out.println("Caught derived class exception"); 
    }
  }
} */
















/*class Parent1
{
	public void m1()
	{
		System.out.println("Hello");
	}
	
}*/

/*public class Demow extends Parent1
{
	public  void m1()
	{
		System.out.println("Hello is not possible");
	}
	public static void main(String[] args)
	{
		int sum=10;
		try 
        {
            int i;
            for (i = -1; i < 3 ;++i)
                sum = (sum / i);
        }
        catch(ArithmeticException e) 
        {
    	System.out.print("0");        	
        } 
        System.out.print(sum);
		
		
		try {
	         throw 10;
	      }
	      catch(int e) {
	         System.out.println("Got the  Exception " + e);
	      }
		  try {
		         throw new Demow();
		      }
		      catch(Demow t) {
		         System.out.println("Got the Test Exception");
		      }
		      finally {
		         System.out.println("Inside finally block ");
		      }
		
		
		Parent1 d=new Demow();
		d.m1();
		System.out.println("-----------------------");
		Demow a=new Demow();
		a.m1();
		System.out.println("---------------------");
	    Parent1 p=new Parent1();
	    p.m1();
	
	}

}
*/