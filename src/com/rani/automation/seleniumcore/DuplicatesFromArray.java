package com.rani.automation.seleniumcore;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DuplicatesFromArray 
{

	public static void main(String[] args)
	{
int[] a = {12,12,12,13,78,99,12,13,79,12,1,2,100};
List duplicates=new ArrayList();
Set set=new TreeSet();
for(int i=0;i<=a.length;i++)
{
	
	Boolean b=set.add(a[i]);
	if(b)
	{
		System.out.println("not a duplicate" +a[i]);
	}
	else
	{
		System.out.println(" duplicate elements:" +a[i]);
		//System.out.println(set.(a[i]));
	
	}
}
System.out.println(set);


List list=new ArrayList(set);

System.out.println("Min:" +list.get(0));
System.out.println("Max:" +list.get(list.size()-1));
System.out.println(duplicates);




		

	}

}

