package com.nt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;


public class ClassC {

	public static void main(String[] args) {
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee("jhan","hbsf",101,10,1000));
		al.add(new Employee("hbfs","dww",101,10,4000));
		al.add(new Employee("mesgf","er",103,20,2000));
		al.add(new Employee("khwc","hbsmff",104,30,3000));
		al.add(new Employee("trt","hhg",104,30,5000));
		
		al.stream().collect(Collectors.groupingBy(Employee::getEno,
	    Collectors.maxBy(Comparator.comparingInt(Employee::getSal)))).forEach((a,b)->System.out.println(a+" "+b.get()));;
		
	    System.out.println("===================");
		
	    
		
	}
}
