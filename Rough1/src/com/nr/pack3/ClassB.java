package com.nr.pack3;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class ClassB {

	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee("jhan","hbsf",101,10,1000));
		al.add(new Employee("hbfs","dww",101,10,4000));
		al.add(new Employee("mesgf","er",103,20,2000));
		al.add(new Employee("khwc","hbsmff",104,30,3000));
		
		
		Map mm=al.stream().collect(Collectors.groupingBy(Employee::getEdepno,Collectors.averagingInt(Employee::getSal)));
		System.out.println(mm);
		
		
		
		
		
		//al.stream().sorted(Comparator.comparingInt(Employee::getEno).thenComparing(Employee::getFname)).collect(Collectors.toList()).forEach(System.out::println);
		//al.stream().map(m->m.getFname()).collect(Collectors.toList()).forEach(System.out::println);
		
		Map<Integer,Long> m=al.stream().collect(Collectors.groupingBy(Employee::getEdepno,Collectors.counting()));
		Map<Integer, Long> ss = m.entrySet().stream()
		        .sorted(Map.Entry.comparingByValue()) // sorts ascending by Long values
		        .collect(Collectors.toMap(
		                Map.Entry::getKey,
		                Map.Entry::getValue,
		                (a, b) -> a,
		                LinkedHashMap::new // keeps sorted order
		        ));
		System.out.println(ss);
	}
}
