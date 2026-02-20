package com.nt;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClassF {

	
	public static void main(String[] args) {
		String s="silent";
		String s1="listen";
		
	boolean b=	s.chars().sorted().mapToObj(m->(char)m).collect(Collectors.toList())
			.equals(s1.chars().sorted().mapToObj(m->(char)m).collect(Collectors.toList()));
		//System.out.println(b);
	int ab=1234,sum=0;
	while(ab>0)
	{
		sum+=ab%10;
		ab=ab/10;
	}
	//	System.out.println(sum);
		List<Integer> l=Arrays.asList(1,2,3,4,1,3,5,6,7,7);
		int target=6;
		Map<Integer, Long> m=l.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		Stream<Entry<Integer, Long>> mm=m.entrySet().stream().sorted(Comparator.comparing(Map.Entry<Integer,Long>::getValue).reversed());
//		Iterator i=mm.iterator();
//		while(i.hasNext())
//		{
//		//	System.out.println(i.next());
//		}
		l.stream().filter(data->data.intValue()<target).max(Integer::compareTo);
		
		System.out.println("-==============");
        String s2="i 87am66j58hansi";		
    s2.chars().mapToObj(m1->String.valueOf((char)m1)).filter(data->data.matches("[0-9]")).collect(Collectors.toList()).forEach(System.out::println);
		String s3="0200460030240";
		Collection<List<Character>> ll=s3.chars().mapToObj(m1->(char)m1).collect(Collectors.partitioningBy(n->n.equals('0'))).values();
		//ll.stream().flatMap(da->da.stream()).collect(Collectors.toList()).forEach(System.out::print);
		
		
		
	}
}
