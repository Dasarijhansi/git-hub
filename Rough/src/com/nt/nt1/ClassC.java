package com.nt.nt1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

import com.nt.Employee;

public class ClassC {

	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee("jhan","hbsf",101,10,1000));
		al.add(new Employee("mgf","dww",104,10,4000));
		al.add(new Employee("mesgf","er",102,20,2000));
		al.add(new Employee("mb","hbsmff",103,30,3000));
		
		al.stream().sorted(Comparator.comparing(Employee::getLname).thenComparing(Comparator.comparing(Employee::getFname)))
		.collect(Collectors.toList()).forEach(System.out::println);;
		al.stream().map(data->data.getFname()).forEach(System.out::println);
		
		
		
	}
}
