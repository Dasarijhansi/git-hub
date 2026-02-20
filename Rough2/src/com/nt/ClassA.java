package com.nt;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClassA {

	
	public static void main(String[] args) {
		
		String s="jh35a7n78u9";
		//s.chars().mapToObj(da->String.valueOf((char)da)).map(data->data.replaceAll("[aeiou]", "")).collect(Collectors.toList()).forEach(System.out::print);;
	    String s1="30607008087";
	    Collection<List<String>> m= s1.chars().mapToObj(da->String.valueOf((char)da)).collect(Collectors.partitioningBy(da->!da.equals("0"))).values();
	    //m.stream().flatMap(da->da.stream()).collect(Collectors.toList()).forEach(System.out::print);
		Collection<Long> mm=s.chars().mapToObj(m1->String.valueOf((char)m1)).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).values();
	    boolean b=mm.stream().anyMatch(da->da>2);
	    //System.out.println(b);
        System.out.println("==========================");
        s.chars().mapToObj(d->(char)d).filter(da->Character.isDigit(da)).collect(Collectors.toList()).forEach(System.out::print);
        
        
        
	    
	    
	   
	   
	   
	   
	   
	}
}
