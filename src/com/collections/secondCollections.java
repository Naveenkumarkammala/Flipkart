package com.collections;
import java.util.*;
public class secondCollections 
{
	static
	{
		System.out.println("this is  list class");
		HashSet a=new HashSet();
		a.add(39);
		a.add("suresh");
		a.add("public");
		a.add(89);
		a.add(39);
		a.add("suresh");
		System.out.println(a);
		System.out.println("implementing the iterator interface");
		Iterator it=a.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
	}
	public static void main(String[] args) {
		
	}

}
