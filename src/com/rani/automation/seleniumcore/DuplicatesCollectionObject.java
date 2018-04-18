package com.rani.automation.seleniumcore;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DuplicatesCollectionObject {

	public static void main(String[] args)
	{
		List list1=new ArrayList();
		list1.add(10);
		list1.add(30);
		list1.add(90);
        list1.add(100);
		list1.add(90);
		//Set set=new TreeSet(list1);
		//System.out.println(set);
		//Set set1=new TreeSet();
		//set1.addAll(list1);
		//System.out.println(set1);
		Set set2=new TreeSet();
		for(int i=0;i<=list1.size();i++)
		{
			//set2.add(list1.get(i));
			Object a=list1.get(i);
			Boolean b=set2.add(a);
			if(b)
			{
				System.out.println("not a duplicate" +list1.get(i));
			}
			else
			{
				System.out.println(" duplicate elements:" +list1.get(i));
				
			}
		}
		System.out.println(set2);

				
				
		
	
			
		}

		

		

	}


