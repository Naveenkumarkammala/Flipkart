package com.collections;
import java.util.*;
import java.util.Iterator;
public class firstCollections 
{
	public static void main(String[] args) {
		System.out.println("implementing the collections class");
		
		firstCollections f=new firstCollections();
		f.meth3();
	}
	void meth1()
	{
		System.out.println("hell");
		ArrayList a=new ArrayList();
		a.add(393);
		a.add("mahesh");
		a.add("lokesh");
		a.add("mahesh");
		a.add(88);
		a.add(29);
		a.add(88);
		System.out.println(a);
		System.out.println("..............................");
		System.out.println("getting the all data from for loop");
		for(int i=0;i<=a.size()-1;i++)
		{
			System.out.print(a.get(i)+" ");
		}
		System.out.println("\n");
		System.out.println("getting the all data from iterator interface");
		System.out.println("\n");
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}

	}
	void meth2()
	{
		System.out.println("implementing the LinkedList");
		LinkedList l=new LinkedList();
		l.add(40943);
		l.add(9);
		l.add("padma");
		l.add(9);
		l.add("hello");
		l.add("padma");
		System.out.println(l);
		System.out.println("\n");
		System.out.println("for loop reterving the data");
		for(int p=0;p<=l.size()-1;)
		{
			
			System.out.print(l.get(p)+" ");
			p++;	
		}
		
		
		
		
	}
	private void meth3()
	{
		System.out.println("implementing the vector class");
		Vector v=new Vector();
		v.add(94);
		v.add("kdkls");
		v.add("kdnsf");
		v.add(9897);
		v.add(94);
		v.add("kdkls");
		System.out.println(v);
		System.out.println("\n");
		for(int m=0;m<=v.size()-1;m++)
		{
			System.out.print(v.get(m)+" ");
			
		}
		System.out.println("\n");
		System.out.println("this is iterator interface");
		Iterator it=v.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
	}

}
