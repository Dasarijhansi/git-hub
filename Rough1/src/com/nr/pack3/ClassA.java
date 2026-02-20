package com.nr.pack3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ClassA {

	
	public static void main(String[] args) {
		
	 List<Integer>  list=Arrays.asList(1,4,7,5,6,3,2,1,4);	 
   Collection<Long> c= list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).values();
	boolean b= c.stream().noneMatch(da->da>=2);
    System.out.println(b);
	}
}
