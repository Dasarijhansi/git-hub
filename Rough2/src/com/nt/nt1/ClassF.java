package com.nt.nt1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ClassF {

	public static void main(String[] args) 
	{ 
		
	List<Integer> list=Arrays.asList(1,4,5,2,5,2);
	list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
	
	
	}
	
	
}
