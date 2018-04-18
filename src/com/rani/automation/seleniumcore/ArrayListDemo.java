package com.rani.automation.seleniumcore;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo 
{

	public static void main(String[] args)
	{
		List list1=new ArrayList();
		list1.add(10);
		list1.add(30);
		list1.add(40);
		list1.add("keerthi");
		ArrayList arraylist=new ArrayList<>();
		arraylist.add(10);
		arraylist.add("Rani");
		arraylist.add(10.96f);
		arraylist.addAll(2,list1);
		System.out.println(arraylist);
		System.out.println(list1.get(2));
		ArrayList arraylist1=new ArrayList();
		arraylist1.add(60);
		arraylist1.add("hani");
		arraylist1.add(70.96f);
		arraylist1.addAll(list1);
		System.out.println(arraylist1.get(4));
		System.out.println(arraylist1);

		System.out.println(arraylist1.add(5));



	}
}

	




		
		
		
			


		
		


