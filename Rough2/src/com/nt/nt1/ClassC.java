package com.nt.nt1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class ClassC {

	
	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee("jhan","absf",101,10,1000));
		al.add(new Employee("wbfs","wdww",102,10,4000));
		al.add(new Employee("jesgf","er",101,20,2000));
		al.add(new Employee("khwc","hbsmff",102,20,3000));
		al.add(new Employee("dh","rdg",103,30,2000));
		
		//al.stream().sorted(Comparator.comparingInt(Employee::getEno).thenComparing(Employee::getFname)).collect(Collectors.toList()).forEach(System.out::println);;
		//al.stream().collect(Collectors.groupingBy(Employee::getEdepno,Collectors.maxBy(Comparator.comparing(Employee::getSal)))).forEach((a,b)->System.out.println(a+" "+b));;	
	//  al.stream().collect(Collectors.groupingBy(Employee::getEdepno,Collectors.summingInt(Employee::getSal))).forEach((a,b)-> System.out.println(a+" "+b));	
	//al.stream().collect(Collectors.groupingBy(Employee::getEdepno,Collectors.counting())).forEach((a,b)->System.out.println(a+" "+b));;
	//	al.stream().collect(Collectors.groupingBy(Employee::getEdepno,Collectors.summingInt(Employee::getSal))).forEach((a,b)->System.out.println(a+" "+b));
    
	al.stream().collect(Collectors.groupingBy(Employee::getEdepno,Collectors.averagingInt(Employee::getSal))).forEach((a,b)->System.out.println(a+" "+b));;
	
	
	
	}
}
