package com.nt.nt1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ClassD {

	
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,4,6,2,1,7,3,2,2,4);
		Map<Integer, Long> l=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		l.entrySet().stream().sorted(Comparator.comparing(Map.Entry<Integer, Long>::getValue).reversed()).collect(Collectors.toList()).forEach(System.out::println);;
	    
		
		
		
	
	
	
	
	
	}
}
