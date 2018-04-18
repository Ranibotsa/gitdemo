package com.rani.automation.seleniumcore;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class HashSetTestDemo {

	public static void main(String[] args) 
	{
	       LinkedHashSet hashset= new LinkedHashSet();       
		System.out.println(hashset.add(10));
		System.out.println(hashset.add(50));
		System.out.println(hashset.add("keerthi"));
		System.out.println(hashset.add("anu"));

		System.out.println(hashset.add(10.35f));
		System.out.println(hashset.add(10.35f));
		System.out.println(hashset.add(50));
	       System.out.println(hashset);

           List list=new ArrayList(hashset);           
      		list.add("keerthi");
      		System.out.println(list);
      		LinkedHashSet hashSet=new LinkedHashSet(list);  

System.out.println(hashset);

		

        



           



		
		

	}

}
