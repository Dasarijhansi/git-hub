package com.nt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClassB {

	public static void main(String[] args) {
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee("jhan","hbsf",101,10,1000));
		al.add(new Employee("hbfs","dww",102,10,4000));
		al.add(new Employee("mesgf","er",103,20,2000));
		al.add(new Employee("khwc","hbsmff",104,30,3000));
		
	  //al.stream().sorted(Comparator.comparing(Employee::getFname).
		//	  thenComparing(Comparator.comparing(Employee::getLname)).reversed()).collect(Collectors.toList()).forEach(System.out::println);;
			  
     // al.stream().collect(Collectors.groupingBy(Employee::getEdepno,Collectors.summingInt(Employee::getSal))).forEach((a,b)->System.out.println(a+" "+b));;
	//al.stream().collect(Collectors.groupingBy(Employee::getEdepno,Collectors.maxBy(Comparator.comparing(Employee::getSal)))).forEach((a,b)->System.out.println(a+" "+b.get().getFname()));;	  
	al.stream().collect(Collectors.groupingBy(Employee::getEdepno,Collectors.counting())).forEach((x,y)->System.out.println(x+" "+y));;		  
			  
	
	}
}
