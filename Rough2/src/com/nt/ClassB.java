package com.nt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClassB {

	public static void main(String[] args) {
	

      List<Integer> list=Arrays.asList(2,3,7,4,6,1);
      int target =5;
      
     int ab= list.stream().filter(d-> d.intValue()<target).max(Integer::compareTo).get();
    System.out.println(ab);
	}
}