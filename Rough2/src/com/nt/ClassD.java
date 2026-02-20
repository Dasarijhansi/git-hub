package com.nt;

import java.util.HashSet;
import java.util.Iterator;

public class ClassD {

	
	public static void main(String[] args) {
		
		HashSet<Employee> al=new HashSet<Employee>();
		al.add(new Employee("jhan","hbsf",101,10,1000));
		al.add(new Employee("jhan","hbsf",101,10,1000));
		al.add(new Employee("jhan","hbsf",101,10,1000));
		
		Iterator<Employee> i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}
}
